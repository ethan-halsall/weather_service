/*
 * Copyright (C) 2020 RevengeOS
 * Copyright (C) 2020 Ethan Halsall
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.revengeos.weathericons

import android.content.Context
import android.graphics.drawable.Drawable

class WeatherIconsHelper {
    companion object {
        fun getDrawable(state : Int, context : Context): Int? {
            val resourceIdentifier: Int = context.resources.getIdentifier(
                "weather_$state",
                "drawable",
                context.packageName
            )
            return resourceIdentifier
        }
    }
}