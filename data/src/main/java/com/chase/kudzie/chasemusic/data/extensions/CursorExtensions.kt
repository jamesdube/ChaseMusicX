package com.chase.kudzie.chasemusic.data.extensions

import android.database.Cursor

internal fun Cursor.getInt(columnName: String): Int {
    try {
        return this.getInt(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }
}

internal fun Cursor.getLong(columnName: String): Long {
    try {
        return this.getLong(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }
}

internal fun Cursor.getString(columnName: String): String {
    try {
        return this.getString(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }
}

internal fun Cursor.getIntOrNull(columnName: String): Int? {
    try {
        return this.getInt(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }
}

internal fun Cursor.getLongOrNull(columnName: String): Long? {
    try {
        return this.getLong(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }

}

internal fun Cursor.getStringOrNull(columnName: String): String? {
    try {
        return this.getString(this.getColumnIndex(columnName))
    } catch (ex: IllegalStateException) {
        throw IllegalStateException("invalid column $columnName", ex)
    }
}