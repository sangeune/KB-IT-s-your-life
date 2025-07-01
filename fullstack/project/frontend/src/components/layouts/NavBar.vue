<script setup>
import { reactive, computed } from "vue";
import config from "@/config";
import MenuGroup from "./menu/MenuGroup.vue";
import AccountMenuGroup from "./menu/AccountMenuGroup.vue";

let state = reactive({ isNavShow: false });

let navClass = computed(() =>
  state.isNavShow ? "collapse navbar-collapse show" : "collapse navbar-collapse"
);

const toggleNavShow = () => (state.isNavShow = !state.isNavShow);
</script>

<template>
  <!-- 최상위 네비게이션 바 -->
  <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <!-- 반응형 레이아웃을 위한 컨테이너 -->
    <div class="container-fluid">
      <!-- 홈으로 이동하는 라우터 링크, 브랜드 영역 -->
      <router-link class="navbar-brand" to="/">
        <i class="fa-solid fa-house"></i>
        Scoula
      </router-link>
      <!-- 햄버거 버튼 -->
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#collapsibleNavbar"
        @click="toggleNavShow"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div :class="navClass" id="collapsibleNavbar">
        <!-- 추후 작업 예정 -->
        <MenuGroup :menus="config.menus" />
        <AccountMenuGroup />
      </div>
    </div>
  </nav>
</template>
<style></style>
