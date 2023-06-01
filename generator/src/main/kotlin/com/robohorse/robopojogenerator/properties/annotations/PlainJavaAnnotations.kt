package com.robohorse.robopojogenerator.properties.annotations

internal sealed class PojoAnnotations(
    val classAnnotation: String = EMPTY_ANNOTATION,
    val annotation: String = EMPTY_ANNOTATION
) {
    object GSON : PojoAnnotations(
        annotation = "@SerializedName(\"%1\$s\")"
    )

    object LOGAN_SQUARE : PojoAnnotations(
        classAnnotation = "@JsonObject",
        annotation = "@JsonField(name =\"%1\$s\")"
    )

    object AUTO_VALUE_GSON : PojoAnnotations(
        classAnnotation = "@AutoValue",
        annotation = "@SerializedName(\"%1\$s\")"
    )

    object FAST_JSON : PojoAnnotations(
        annotation = "@JSONField(name=\"%1\$s\")"
    )

    object MOSHI : PojoAnnotations(
        annotation = "@Json(name = \"%1\$s\")"
    )

    class Jackson(useLombok: Boolean, useIgnoreUnknown: Boolean) : PojoAnnotations(
        classAnnotation = if (useLombok) if (useIgnoreUnknown) "@Data\n@JsonIgnoreProperties(ignoreUnknown = true)" else "@Data" else if (useIgnoreUnknown) "@JsonIgnoreProperties(ignoreUnknown = true)" else EMPTY_ANNOTATION,
        annotation = "@JsonProperty(\"%1\$s\")"
    )

    class Lombok(useValue: Boolean) : PojoAnnotations(
        classAnnotation = if (useValue) "@Value" else "@Data"
    )
}

private const val EMPTY_ANNOTATION = ""
