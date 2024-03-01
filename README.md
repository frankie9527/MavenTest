# 发布android projet（kotlin 版本）作为库
## java lib 添加 如下
id("org.jetbrains.kotlin.android")  ，因为当前android 基本都是kotlin，最好添加次语句到 build.gradle.kts 配置文件中。否则你的架包如果含有kotlin 则会有引用失败提示

- Unresolved reference: TestKt

## 添加kotlin 包
-  implementation("androidx.core:core-ktx:1.10.1")
    kotlinOptions {
        jvmTarget = "1.8"
    }

如果你的jar 里面有kotlin 代码，则一定要添加这个包。否则报如下错误

Inconsistent JVM-target compatibility detected for tasks 'compileDebugJavaWithJavac' (1.8) and 'compileDebugKotlin' (17).

### doc
https://developer.android.com/build/publish-library

