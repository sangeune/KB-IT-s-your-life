<script setup>
const props = defineProps({
  menu: { Type: Object, required: true },
});
</script>

<template>
  <!-- 메뉴 항목 하나 -->
  <li class="nav-item">
    <!-- 링크로 이동 -->
    <router-link class="nav-link" :to="menu.url">
      <i :class="menu.icon"></i>
      {{ menu.title }}
    </router-link>
  </li>
</template>
<style></style>
