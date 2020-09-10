package com.example.cocuschallenge.data.response


data class Members(
    val username: String,
    val name: String,
    val honor: Int,
    val clan: String,
    val leaderboardPosition: Int,
    val skills: List<String>,
    val ranks: Ranks,
    val codeChallenges: CodeChallenges
)