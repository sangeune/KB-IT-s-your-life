<script setup>
import { useRouter } from "vue-router";

const router = useRouter();

// 로그아웃 시 홈으로 이동
const logout = (e) => {
  // 로그아웃
  router.push("/");
};
</script>

<template>
  <a href="#" class="nav-link" @click.prevent="logout">
    <i class="fa-solid fa-right-from-bracket"></i>
    로그아웃
  </a>
</template>
