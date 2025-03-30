<template>
  <!-- <li><input type="checkbox" v-model="checked" /> 옵션1</li> -->
  <!-- <li><input type="checkbox" :checked="checked" /> {{ name }}</li> -->
  <li><input type="checkbox" :checked="checked" />{{ id }} - {{ name }}</li>
</template>

<script>
export default {
  name: "CheckboxItem",
  //   data() {
  //     return {
  //       checked: false,
  //     };
  //   },
  // props: ["name", "checked"], // name, checked 추가
  props: {
    id: [Number, String],
    name: String,
    checked: {
      type: Boolean,
      required: false, // 기본값 false
      default: false, // 생략 가능
    },
  },
};
</script>
