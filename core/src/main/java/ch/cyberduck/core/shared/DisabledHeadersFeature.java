package ch.cyberduck.core.shared;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.features.Headers;
import ch.cyberduck.core.transfer.TransferStatus;

import java.util.Collections;
import java.util.Map;

public class DisabledHeadersFeature implements Headers {
    @Override
    public Map<String, String> getDefault() {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, String> getMetadata(final Path file) {
        return Collections.emptyMap();
    }

    @Override
    public void setMetadata(final Path file, final TransferStatus status) {
        //
    }
}
