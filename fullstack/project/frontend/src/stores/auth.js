import { ref, computed, reactive } from "vue";
import { defineStore } from "pinia";
import axios from "axios";

// 초기 상태
const initState = {
  token: "", // 접근 토큰(JWT)
  user: {
    username: "", // 사용자 ID
    email: "", // Email
    roles: [], // 권한 목록
  },
};

// 스토어 정의
export const useAuthStore = defineStore("auth", () => {
  const state = ref({ ...initState });

  const isLogin = computed(() => !!state.value.user.username); // 로그인 여부

  const username = computed(() => state.value.user.username); // 로그인 사용자 ID

  const email = computed(() => state.value.user.email); // 로그인 사용자 email

  // 로그인 함수
  const login = async (member) => {
    state.value.token = "test token"; // 임시 토큰 세팅
    state.value.user = {
      username: member.username,
      email: member.username + "@test.com",
    };

    // api 호출
    const { data } = await axios.post("/api/auth/login", member);
    state.value = { ...data };

    console.log(state);

    localStorage.setItem("auth", JSON.stringify(state.value));
  };

  // 로그아웃 함수
  const logout = () => {
    localStorage.clear();
    state.value = { ...initState };
  };

  // 토큰 얻기
  const getToken = () => state.value.token;

  // 상태 로딩 - 로컬 스토리지에서 불러오기
  const load = () => {
    const auth = localStorage.getItem("auth");
    if (auth != null) {
      state.value = JSON.parse(auth);
      console.log(state.value);
    }
  };

  // 정보 수정
  const changeProfile = (member) => {
    state.value.user.email = member.email;
    localStorage.setItem("auth", JSON.stringify(state.value));
  };

  load();

  return {
    state,
    username,
    email,
    isLogin,
    changeProfile,
    login,
    logout,
    getToken,
  };
});
