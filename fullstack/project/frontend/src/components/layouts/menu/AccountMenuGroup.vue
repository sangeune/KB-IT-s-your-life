<script setup>
import { computed } from "vue";
import MenuItem from "./MenuItem.vue";
import AccountMenuItem from "./AccountMenuItem.vue";
import LogoutMenuItem from "./LogoutMenuItem.vue";
import config from "@/config";

const { login, join } = config.accoutMenus;
import { useAuthStore } from "@/stores/auth.js";

const auth = useAuthStore();

// 로그인 상태 (임시: false)
const islogin = computed(() => auth.isLogin);
// 사용자 이름 (임시: 없음)
const username = computed(() => auth.username);
</script>

<template>
  <ul class="navbar-nav ms-auto">
    <!-- 로그인 상태 -->
    <template v-if="islogin">
      <AccountMenuItem :username="username" />
      <LogoutMenuItem />
    </template>

    <!-- 비로그인 상태 -->
    <template v-else>
      <!-- 로그인 메뉴 -->
      <MenuItem :menu="login" />
      <!-- 회원가입 메뉴 -->
      <MenuItem :menu="join" />
    </template>
  </ul>
</template>
