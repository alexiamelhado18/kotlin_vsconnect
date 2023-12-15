package com.senai.vsconnect.models

data class Servico(
    var titulo: String,
    var valor: Float,
    var techs: List<String>,
    var descricao: String
)
