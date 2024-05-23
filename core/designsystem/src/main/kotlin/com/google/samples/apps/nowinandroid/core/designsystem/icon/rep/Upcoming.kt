/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.core.designsystem.icon.rep

import androidx.compose.ui.graphics.vector.ImageVector

public val Icons.Rounded.Upcoming: ImageVector
    get() {
        if (_upcoming != null) {
            return _upcoming!!
        }
        _upcoming = materialIcon(name = "Rounded.Upcoming") {
            materialPath {
                moveTo(20.45f, 6.55f)
                lineTo(20.45f, 6.55f)
                curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f)
                lineTo(16.89f, 8.7f)
                curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f)
                curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f)
                curveTo(20.83f, 7.55f, 20.83f, 6.93f, 20.45f, 6.55f)
                close()
            }
            materialPath {
                moveTo(12.02f, 3.0f)
                horizontalLineToRelative(-0.03f)
                curveTo(11.44f, 3.0f, 11.0f, 3.44f, 11.0f, 3.98f)
                verticalLineToRelative(3.03f)
                curveTo(11.0f, 7.56f, 11.44f, 8.0f, 11.98f, 8.0f)
                horizontalLineToRelative(0.03f)
                curveTo(12.56f, 8.0f, 13.0f, 7.56f, 13.0f, 7.02f)
                verticalLineTo(3.98f)
                curveTo(13.0f, 3.44f, 12.56f, 3.0f, 12.02f, 3.0f)
                close()
            }
            materialPath {
                moveTo(7.1f, 10.11f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f)
                lineTo(4.96f, 6.54f)
                curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f)
                lineTo(3.55f, 6.55f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f)
                curveToRelative(0.63f, 0.62f, 1.53f, 1.54f, 2.15f, 2.17f)
                curveTo(6.09f, 10.49f, 6.72f, 10.49f, 7.1f, 10.11f)
                close()
            }
            materialPath {
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.24f, 0.0f, -2.31f, -0.75f, -2.76f, -1.83f)
                curveTo(8.92f, 12.43f, 8.14f, 12.0f, 7.34f, 12.0f)
                lineTo(4.0f, 12.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 5.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineToRelative(-3.34f, 0.0f)
                curveToRelative(-0.8f, 0.0f, -1.58f, 0.43f, -1.9f, 1.17f)
                curveTo(14.31f, 14.25f, 13.24f, 15.0f, 12.0f, 15.0f)
            }
        }
        return _upcoming!!
    }

private var _upcoming: ImageVector? = null
