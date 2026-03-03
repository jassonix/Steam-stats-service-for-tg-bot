@GetMapping("/users/{telegramId}/steam-id")
public ResponseEntity<SteamIdResponse> getBoundSteamId(@PathVariable Long telegramId) {
    // логика поиска в БД: SELECT steam_id FROM users WHERE telegram_id = ?
}
