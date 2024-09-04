# AIGC智能答题系统



## 项目介绍

基于 Vue 3 + Spring Boot + Redis + ChatGLM + RxJava + SSE 实现。

用户可以基于 AI 快速制作并发布答题应用，支持检索、分享、在线答题并基于 AI 得到回答总结；管理员可以集中管理和审核应用。



## 技术选型

### 开发工具

- [CodeGeeX 智能编程助手](https://codegeex.cn/)



### 前端

#### Web 网页开发

- Vue 3 
- Vue-CLI 脚手架
- Pinia 状态管理
- Axios 请求库
- Arco Design 组件库
- 前端工程化：ESLint + Prettier + TypeScript
- 富文本编辑器
- QRCode.js 二维码生成
- OpenAPI 前端代码生成



### 后端

- Spring Boot 开发框架
- 存储层：MySQL 数据库 + Redis 缓存 + 腾讯云 COS 对象存储
- MyBatis-Plus 及 MyBatis X 自动生成
- Redission 分布式锁
- Caffeine 本地缓存
- 基于 ChatGLM 大模型实现 AI 能力
- RxJava 响应式框架 + 多线程 / 线程池实战 
- Shardingsphere 分库分表 + 分布式 ID 雪花算法
- SSE 服务端推送
- 多种设计模式





## 核心业务流程



![image-20240904035844359](https://tcode-1318171279.cos.ap-guangzhou.myqcloud.com/github_picture/image-20240904035844359.png)



时序图：

![img](https://pic.yupi.icu/1/1714045657446-df879936-070e-4528-9025-b7ca7f680910.jpeg)



## 项目功能梳理



### 平台

- 用户模块

- - 注册
  - 登录
  - 管理用户 - 增删改查（仅管理员可用）

- 应用模块

- - 创建应用（名称、描述、上传图片、应用类型）
  - 修改应用（用户）
  - 审核发布和下架应用（管理员）
  - 管理应用 - 增删改查（管理员）
  - 应用分享（扫码查看）

- 题目模块

- - 创建题目（名称、选项）
  - 修改题目
  - 删除题目
  - AI 生成题目

- 评分模块

- - 多种评分策略
  - 创建评分结果
  - 题目得分设置

- 回答模块

- - 提交选择
  - 回答记录
  - AI 分析总结回答

- 统计分析模块

- - 应用评分结果分析

## 架构设计

![image-20240904044210609](.\aiga-backend\image\image-20240904044210609.png)



