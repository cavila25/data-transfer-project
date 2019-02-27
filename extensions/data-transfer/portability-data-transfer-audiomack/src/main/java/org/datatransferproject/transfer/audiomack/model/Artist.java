/*
 * Copyright 2019 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.datatransferproject.transfer.audiomack.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO of artist: https://www.audiomack.com/data-api/docs#entity-artist
 */
public class Artist {
  @JsonProperty("id")
  private long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("url_slug")
  private String urlSlug;

  public long getId() { return id; }

  public String getName() { return name; }

  public String getUrlSlug() { return urlSlug; }
}
