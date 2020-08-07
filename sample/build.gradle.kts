import co.anitrend.multisearch.buildSrc.Libraries

plugins {
    id("co.anitrend.multisearch")
}

dependencies {
    implementation(project(":multi-search"))

    implementation(Libraries.AndroidX.AppCompat.appcompat)
    implementation(Libraries.AndroidX.Core.coreKtx)

    implementation(Libraries.timber)
}