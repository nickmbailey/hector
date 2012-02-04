package me.prettyprint.hector.api;

import me.prettyprint.hector.api.beans.HColumn;

public interface ColumnFactory {
  <N, V> HColumn<N, V> createColumn(N name, V value, Serializer<N> nameSerializer, Serializer<V> valueSerializer);

  <N, V> HColumn<N, V> createColumn(N name, V value, long clock, Serializer<N> nameSerializer, Serializer<V> valueSerializer);

  <N, V> HColumn<N, V> createColumn(N name, V value);

  <N, V> HColumn<N, V> createColumn(N name, V value, long clock);

  <N, V> HColumn<N, V> createColumn(N name, V value, int tll);

  <N, V> HColumn<N, V> createColumn(N name, V value, long clock, int tll);

  HColumn<String, String> createStringColumn(String name, String value);
}
