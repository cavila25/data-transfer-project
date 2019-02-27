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
 * POJO of song: https://www.audiomack.com/data-api/docs#entity-music
 */
public class Song {

  @JsonProperty("id")
  private long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("url_slug")
  private String urlSlug;

  @JsonProperty("artist")
  private String artist;
}
