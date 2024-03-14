/*
 * This file is part of Awesome Compass.
 * Copyright (C) 2024 Shivendra K Dubey <vaibhavtech2012@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Compass is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vaibhavtech.compass.view

import android.location.Location
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vaibhavtech.compass.model.Azimuth
import com.vaibhavtech.compass.model.LocationStatus
import com.vaibhavtech.compass.model.SensorAccuracy

class CompassViewModel : ViewModel() {

    val azimuth = MutableLiveData<Azimuth>()
    val sensorAccuracy = MutableLiveData(SensorAccuracy.NO_CONTACT)
    val trueNorth = MutableLiveData(false)
    val hapticFeedback = MutableLiveData(true)
    val location = MutableLiveData<Location>()
    val locationStatus = MutableLiveData(LocationStatus.NOT_PRESENT)
}
