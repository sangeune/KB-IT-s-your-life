<template>
  <!-- 네비게이션 바 (부트스트랩) -->
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <span class="navbar-brand">이날치(LeeNalChi)</span>
    <!-- 네비게이션 바 토글 버튼 -->
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>

    <!-- 네비게이션 메뉴 -->
    <!-- router-link : 
      - 내비게이션 링크 컴포넌트로 a태그 대신 사용
      - 페이지를 새로고침하지 않고 다른 페이지로 이동 가능 -->
    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link" to="/">홈</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/about">소개</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/members">멤버</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/videos">영상</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import { reactive, computed } from "vue";

export default {
  // 사용할 데이터 정의
  setup() {
    // 반응형 상태 객체: 네비게이션 메뉴가 펼쳐졌는지 여부를 저장
    const state = reactive({
      isNavShow: false,
    });
    // 메뉴가 펼쳐지면 'show' 클래스를 추가
    const navClass = computed(
      () =>
        state.isNavShow
          ? "collapse navbar-collapse show" // 메뉴 펼쳐진 상태
          : "collapse navbar-collapse" // 메뉴 접힌 상태
    );
    // 토글 버튼 클릭 시 메뉴 상태 반전시키는 함수 (펼침/접힘)
    const changeIsNavShow = () => {
      state.isNavShow = !state.isNavShow;
    };

    return { state, changeIsNavShow, navClass };
  },
};
</script>
