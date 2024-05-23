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

package com.google.samples.apps.nowinandroid.core.designsystem.icon

import androidx.compose.ui.graphics.vector.ImageVector
import com.google.samples.apps.nowinandroid.core.designsystem.icon.rep.Icons
import com.google.samples.apps.nowinandroid.core.designsystem.icon.rep.materialIcon
import com.google.samples.apps.nowinandroid.core.designsystem.icon.rep.materialPath

public val Icons.Outlined.Upcoming: ImageVector
    get() {
        if (_upcoming != null) {
            return _upcoming!!
        }
        _upcoming = materialIcon(name = "Outlined.Upcoming") {
            materialPath {
                moveTo(17.6f, 10.81f)
                lineTo(16.19f, 9.4f)
                lineToRelative(3.56f, -3.55f)
                lineToRelative(1.41f, 1.41f)
                curveTo(21.05f, 7.29f, 17.6f, 10.81f, 17.6f, 10.81f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(6.4f, 10.81f)
                lineTo(7.81f, 9.4f)
                lineTo(4.26f, 5.84f)
                lineTo(2.84f, 7.26f)
                curveTo(2.95f, 7.29f, 6.4f, 10.81f, 6.4f, 10.81f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.77f, 1.76f, -2.54f, 3.0f, -4.58f, 3.0f)
                reflectiveCurveToRelative(-3.81f, -1.24f, -4.58f, -3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        return _upcoming!!
    }

private var _upcoming: ImageVector? = null
