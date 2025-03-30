<template>
  <div>
    <!-- 체크 상태 바뀌면 'check-changed' 이벤트 부모로 발신 -->
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="$emit('check-changed', { id, checked: $event.target.checked })"
    />
    <!-- 체크된 경우 파란색으로 표시 -->
    <span
      v-if="checked === true"
      style="color: blue; text-decoration: underline"
    >
      <i>{{ label }}</i>
    </span>
    <!-- 체크되지 않은 경우 회색으로 표시 -->
    <span v-else style="color: gray">{{ label }}</span>
  </div>
</template>

<script>
export default {
  name: "CheckBox1",
  props: ["id", "checked", "label"], // 부모(NoSlotTest)로부터 받은 값을 props로 사용
};
</script>
