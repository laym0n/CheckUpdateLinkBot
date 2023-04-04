package ru.tinkoff.edu.java.scrapper.usecases;

import ru.tinkoff.edu.java.scrapper.dto.request.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.request.RemoveLinkRequest;
import ru.tinkoff.edu.java.scrapper.entities.TrackedLink;

import java.util.List;

public interface ManageLinksUseCase {
    List<TrackedLink> findAllLinksByIdChat(int idChat);
    TrackedLink addLinkForChat(int idChat, AddLinkRequest addLinkRequest);
    TrackedLink removeLinkFromChat(int idChat, RemoveLinkRequest removeLinkRequest);
}
