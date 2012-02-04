package me.prettyprint.cassandra.model.thrift;

import me.prettyprint.cassandra.model.HColumnImpl;
import me.prettyprint.cassandra.serializers.StringSerializer;
import me.prettyprint.hector.api.ColumnFactory;
import me.prettyprint.hector.api.Serializer;
import me.prettyprint.hector.api.beans.HColumn;
import me.prettyprint.hector.api.factory.HFactory;

public class ThriftColumnFactory implements ColumnFactory {

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value,
      Serializer<N> nameSerializer, Serializer<V> valueSerializer) {
    return HFactory.createColumn(name, value, nameSerializer, valueSerializer);
  }

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value, long clock,
      Serializer<N> nameSerializer, Serializer<V> valueSerializer) {
    return HFactory.createColumn(name, value, clock, nameSerializer, valueSerializer);
  }

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value) {
    return HFactory.createColumn(name, value);
  }

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value, long clock) {
    return HFactory.createColumn(name, value, clock);
  }

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value, int ttl) {
    return HFactory.createColumn(name, value, ttl);
  }

  @Override
  public <N, V> HColumn<N, V> createColumn(N name, V value, long clock, int ttl) {
    return HFactory.createColumn(name, value, clock, ttl);
  }

  @Override
  public HColumn<String, String> createStringColumn(String name, String value) {
    return HFactory.createColumn(name, value);
  }


}
