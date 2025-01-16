package org.sol4k

object Constants {
    @JvmStatic
    val SYSTEM_PROGRAM = PublicKey("11111111111111111111111111111111")

    @JvmStatic
    val TOKEN_PROGRAM_ID = PublicKey("TokenkegQfeZyiNwAJbNbGKPFXCWuBvf9Ss623VQ5DA")

    @JvmStatic
    val TOKEN_2022_PROGRAM_ID = PublicKey("TokenzQdBNbLqP5VEhdkAS6EPFLC1PHnBqCXEpPxuEb")

    @JvmStatic
    val ASSOCIATED_TOKEN_PROGRAM_ID = PublicKey("ATokenGPvbdGVxr1b2hvZbsiqW5xWH25efTNsLJA8knL")

    @JvmStatic
    val COMPUTE_BUDGET_PROGRAM_ID = PublicKey("ComputeBudget111111111111111111111111111111")

    @JvmStatic
    val SYSVAR_RENT_ADDRESS = PublicKey("SysvarRent111111111111111111111111111111111")

    const val PUBLIC_KEY_LENGTH = 32
    const val SIGNATURE_LENGTH = 64
}
