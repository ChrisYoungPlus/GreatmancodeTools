/**
 * This file is part of GreatmancodeTools.
 *
 * Copyright (c) 2013-2016, Narimm <http://github.com/narimm/>
 *
 * GreatmancodeTools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GreatmancodeTools is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GreatmancodeTools.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.greatmancode.tools.commands;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

/**
 * Created for the AddstarMC Program.
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
