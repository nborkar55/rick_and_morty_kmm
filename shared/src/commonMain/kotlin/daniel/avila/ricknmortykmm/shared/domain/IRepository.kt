package daniel.avila.ricknmortykmm.shared.domain

import daniel.avila.ricknmortykmm.shared.domain.model.Character

interface IRepository {
    suspend fun getCharacters(): List<Character>
    suspend fun getCharactersFavorites(): List<Character>
    suspend fun getCharacter(id: Int): Character
    suspend fun addCharacterToFavorites(character: Character)
    suspend fun removeCharacterFromFavorite(idCharacter: Int)
    suspend fun isCharacterFavorite(idCharacter: Int): Boolean
}