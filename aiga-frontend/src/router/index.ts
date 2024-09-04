import { createRouter, createWebHistory } from "vue-router";
import { routes } from "@/router/routes";

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

// 添加 beforeEach 导航守卫
router.beforeEach(async (to, from, next) => {
  if (to.meta.title) {
    document.title = to.meta.title as string;
  } else {
    document.title = "AIGC智能答题系统"; // 默认标题
  }

  // 在这里可以继续添加其他逻辑，如验证用户身份等
  // .....

  next();
});
export default router;
