package com.greatmancode.tools.commands;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

/**
 * Created for the Ark: Survival Evolved.
 * Created by Narimm on 19/02/2018.
 */
@Data
@RequiredArgsConstructor
public class PlayerCommandSender implements CommandSender {
    private final String name;
    private final UUID uuid;

    @Override
    public String toString() {
        return name;
    }
}
