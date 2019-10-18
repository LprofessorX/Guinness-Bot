package com.guiness.bot.protocol

import kotlin.reflect.KClass

data class MetaMessageField(
    val type: MetaMessageFieldType,
    val genericType: MetaMessageFieldType? = null,
    val genericTypeClass: KClass<*>? = null,
    val metaObject: MetaObject? = null, /** present if type or genericType == OBJECT **/
    val delimiter: String? = null
)