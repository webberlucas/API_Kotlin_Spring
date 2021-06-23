package br.com.crudContatos.contatos.repositories

import br.com.crudContatos.contatos.entities.Contact
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository: JpaRepository<Contact, Long> {
}