<template>
  <li><input type="checkbox" :checked="idol.checked" /> {{ idol.name }}</li>
</template>

<script>
export default {
  name: "CheckboxItem2",
  props: ["idol"], // idol 속성으로 전달 받음
};
</script>
