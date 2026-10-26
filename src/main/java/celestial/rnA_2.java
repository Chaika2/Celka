/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  celestial.rnA_2$celestial.rnn_3
 *  com.google.common.base.MoreObjects
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rVm_1;
import celestial.rnA_2;
import com.google.common.base.MoreObjects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rnA_2<T extends rnA_2<T>> {
    private static final Logger id_class = LogManager.getLogger();
    private final Properties id_break;

    private String id_byte(String string) {
        return (String)this.id_break.get(string);
    }

    public rnA_2(Properties properties) {
        this.id_break = properties;
    }

    protected boolean id_class(String string, boolean bl) {
        return this.id_class(string, Boolean::valueOf, bl);
    }

    protected long id_class(String string, long l) {
        return this.id_class(string, rnA_2.id_class(Long::parseLong), l);
    }

    protected int id_class(String string, UnaryOperator<Integer> unaryOperator, int n) {
        return this.id_class(string, rnA_2.id_class(Integer::parseInt), unaryOperator, Objects::toString, n);
    }

    protected String id_class(String string) {
        return (String)this.id_class(string, Function.identity());
    }

    protected int id_class(String string, int n) {
        return this.id_class(string, rnA_2.id_class(Integer::parseInt), Integer.valueOf(n));
    }

    public static Properties id_class(Path path) {
        Properties properties = new Properties();
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            properties.load(inputStream);
        }
        catch (IOException iOException) {
            id_class.error("Failed to load properties from file: " + path);
        }
        return properties;
    }

    protected abstract T id_class(rVm_1 var1, Properties var2);

    protected Properties id_class() {
        Properties properties = new Properties();
        properties.putAll((Map<?, ?>)this.id_break);
        return properties;
    }

    private static <V extends Number> Function<String, V> id_class(Function<String, V> function) {
        return string -> {
            try {
                return (Number)function.apply((String)string);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        };
    }

    protected static <V> Function<String, V> id_class(IntFunction<V> intFunction, Function<String, V> function) {
        return string -> {
            try {
                return intFunction.apply(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                return function.apply((String)string);
            }
        };
    }

    protected <V> V id_class(String string, Function<String, V> function, Function<V, String> function2, V v) {
        String string2 = this.id_byte(string);
        Object object = MoreObjects.firstNonNull(string2 != null ? function.apply(string2) : null, v);
        this.id_break.put(string, function2.apply(object));
        return (V)object;
    }

    protected <V> V id_class(String string, Function<String, V> function) {
        String string2 = this.id_byte(string);
        if (string2 == null) {
            return null;
        }
        this.id_break.remove(string);
        return function.apply(string2);
    }

    protected String id_class(String string, String string2) {
        return this.id_class(string, Function.identity(), Function.identity(), string2);
    }

    protected <V> V id_class(String string, Function<String, V> function, V v) {
        return (V)this.id_class(string, function, Objects::toString, v);
    }

    protected <V> V id_class(String string2, Function<String, V> function, UnaryOperator<V> unaryOperator, Function<V, String> function2, V v) {
        return (V)this.id_class(string2, string -> {
            Object r = function.apply((String)string);
            return r != null ? unaryOperator.apply(r) : null;
        }, function2, v);
    }

    protected rnn_3<Integer> id_break(String string, int n) {
        return this.id_break(string, rnA_2.id_class(Integer::parseInt), n);
    }

    public void id_break(Path path) {
        try (OutputStream outputStream = Files.newOutputStream(path, new OpenOption[0]);){
            this.id_break.store(outputStream, "Minecraft server properties");
        }
        catch (IOException iOException) {
            id_class.error("Failed to store properties to file: " + path);
        }
    }

    protected <V> rnn_3<V> id_break(String string, Function<String, V> function, V v) {
        return this.id_break(string, function, Objects::toString, v);
    }

    protected <V> rnn_3<V> id_break(String string, Function<String, V> function, Function<V, String> function2, V v) {
        String string2 = this.id_byte(string);
        Object object = MoreObjects.firstNonNull(string2 != null ? function.apply(string2) : null, v);
        this.id_break.put(string, function2.apply(object));
        return new celestial.rnn_3(this, string, object, function2);
    }

    protected rnn_3<Boolean> id_break(String string, boolean bl) {
        return this.id_break(string, Boolean::valueOf, bl);
    }

    protected Boolean id_break(String string) {
        return this.id_class(string, Boolean::valueOf);
    }
}

