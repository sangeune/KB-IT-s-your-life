// createRouter 함수를 사용하여 라우터 객체 생성
// createWebHistory: 해시(#)를 사용하지 않고 더 깔끔한 URL 사용할 수 있도록 하는 함수
import { createRouter, createWebHistory } from "vue-router";

import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import Members from "@/pages/Members.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from "@/pages/MemberInfo.vue";
import NotFound from "@/pages/NotFound.vue";

const membersIdGuard = (to, from) => {
  // members/:id 경로는 반드시 이전 경로가
  // /members, /members:id 인 경우만 내비게이션 허용함
  if (from.name !== "members" && from.name !== "members/id") {
    return false;
  }
};

// 경로(path)와 매핑될 컴포넌트 설정
const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: "/", name: "home", component: Home },
    { path: "/about", name: "about", component: About },
    { path: "/members", name: "members", component: Members },
    {
      path: "/members/:id",
      name: "members/id",
      component: MemberInfo,
      beforeEnter: membersIdGuard,
    },
    {
      path: "/videos",
      name: "videos",
      component: Videos,
    },

    // { path: "/:paths(.*)*", name: "NotFound", component: NotFound },
  ],
});

export default router;
