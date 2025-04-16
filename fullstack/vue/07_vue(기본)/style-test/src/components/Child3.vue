<template>
  <!-- <div class="child">
    <h2>Child3</h2>
  </div> -->
  <!-- v-bind 사용 -->
  <div :class="$style.child">
    <h2>Child3</h2>
  </div>
</template>

<script>
export default {
  name: "Child3",
  created() {
    console.log(this.$style);
  },
};
</script>

<!-- module 추가 -->
<style module>
.child {
  background-color: orange;
  border: solid 1px black;
  margin: 1.5em;
  padding: 1em;
}
</style>
