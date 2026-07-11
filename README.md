# LostThingsReclaimAndroid

失物招领平台 Android 客户端（公开版）

> 📱 这是 [hxcan/LostThingsReclaimServer](https://github.com/hxcan/LostThingsReclaimServer) 服务端的配套客户端。

## ✨ 项目简介

本项目是一个基于 Android 的失物招领客户端应用，提供失物登记、拾物发布、智能匹配等核心功能。

## 🚀 功能特性

- 用户注册与登录
- 失物信息发布
- 拾物信息发布
- 智能匹配失物与拾物
- 本地缓存（Room）
- 网络通信（Retrofit + OkHttp）
- MVVM 架构（ViewModel + LiveData）

## 🏗️ 技术栈

- **开发语言**: Java
- **最低 SDK**: 24（Android 7.0）
- **目标 SDK**: 34（Android 14）
- **构建工具**: Gradle 8.6
- **架构**: MVVM
- **核心库**:
  - AndroidX 系列
  - Material Design
  - ConstraintLayout
  - Lifecycle (ViewModel + LiveData)
  - Coroutines
  - Retrofit + OkHttp
  - Room (本地缓存)

## 📦 下载安装

主人可以从 [GitHub Releases](https://github.com/hxcan/LostThingsReclaimAndroid/releases) 页面下载最新的预编译 APK：

- **Debug 版本** - 调试版，便于开发测试
- **Release 版本** - 正式签名版，可直接安装到手机使用

每次代码合并到 `master` 分支后，CI 会自动构建并发布新的 APK。

## 🔨 本地构建

```bash
# 克隆仓库
git clone https://github.com/hxcan/LostThingsReclaimAndroid.git

# 进入项目目录
cd LostThingsReclaimAndroid

# 构建 Debug APK
./gradlew assembleDebug

# 构建 Release APK（需要 keystore.properties）
./gradlew assembleRelease
```

## 📂 项目结构

```
LostThingsReclaimAndroid/
├── app/
│   ├── build.gradle           # 模块级构建配置
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/stupidbeauty/lostthingsreclaim/
│       │   ├── api/           # Retrofit API 接口
│       │   ├── model/         # 数据模型
│       │   ├── repository/    # 数据仓库层
│       │   ├── ui/            # Activity / Fragment
│       │   └── viewmodel/     # ViewModel
│       └── res/               # 资源文件
├── .github/workflows/         # GitHub Actions CI 配置
├── gradle/                    # Gradle Wrapper
├── build.gradle               # 项目级构建配置
└── settings.gradle
```

## 🤝 贡献指南

1. Fork 本仓库
2. 创建 feature 分支 (`git checkout -b feature/AmazingFeature`)
3. 提交改动 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 创建 Pull Request

## 📄 开源协议

本项目采用 MIT 协议开源。

## ⚠️ 注意事项

- 本项目仅包含客户端代码
- 服务端代码请访问 [LostThingsReclaimServer](https://github.com/hxcan/LostThingsReclaimServer)
- API 基地址等运行时配置请通过 `local.properties` 或环境变量注入

## 📧 联系方式

项目维护者：hxcan