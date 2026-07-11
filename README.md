# LostThingsReclaimAndroid
失物招领平台 Android 客户端

## ⚠️ 代码合入规范
**必须通过 Pull Request 合入代码，禁止直接推送到 master 分支！**

所有代码修改必须：
1. 创建 feature 分支
2. 提交 PR
3. 经过审核后才能合并
4. 禁止自行合并！

## 🔐 正式版签名说明

Release APK 由 GitHub Actions 在 push 到 master 时自动构建并使用正式版签名。

所需 GitHub Secrets（在仓库 Settings → Secrets and variables → Actions 中配置）：

| Secret 名 | 含义 |
|-----------|------|
| `RELEASE_KEYSTORE_BASE64` | keystore 文件的 base64 编码内容 |
| `RELEASE_STORE_PASSWORD` | keystore 密码 |
| `RELEASE_KEY_ALIAS` | 密钥别名 |
| `RELEASE_KEY_PASSWORD` | 密钥密码 |

keystore 文件会被解码为 `app/stupidbeauty.keystore`（文件名固定）。

任务关联：#837548745464
