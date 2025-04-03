// createRouter 함수를 사용하여 라우터 객체 생성
// createWebHistory: 해시(#)를 사용하지 않고 더 깔끔한 URL 사용할 수 있도록 하는 함수
import { createRouter, createWebHistory } from "vue-router";

import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import Members from "@/pages/Members.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from "@/pages/MemberInfo.vue";

// 경로(path)와 매핑될 컴포넌트 설정
const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: "/", component: Home },
    { path: "/about", component: About },
    { path: "/members", component: Members },
    { path: "/members/:id", component: MemberInfo }, // 동적 파라미터 id
    { path: "/videos", component: Videos },
  ],
});

export default router;
