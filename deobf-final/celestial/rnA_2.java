package celestial;

import com.google.common.base.MoreObjects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rnA_2<T extends rnA_2<T>> {
   private static final Logger class_ = LogManager.getLogger();
   private final Properties break_;

   private String byte_(String var1) {
      return (String)this.break_.get(var1);
   }

   public rnA_2(Properties var1) {
      this.break_ = var1;
   }

   protected boolean class_(String var1, boolean var2) {
      return this.class_(var1, Boolean::valueOf, var2);
   }

   protected long class_(String var1, long var2) {
      return this.class_(var1, class_(Long::parseLong), var2);
   }

   protected int class_(String var1, UnaryOperator<Integer> var2, int var3) {
      return this.class_(var1, class_(Integer::parseInt), var2, Objects::toString, var3);
   }

   protected String class_(String var1) {
      return this.class_(var1, Function.identity());
   }

   protected int class_(String var1, int var2) {
      return this.class_(var1, class_(Integer::parseInt), Integer.valueOf(var2));
   }

   public static Properties class_(Path var0) {
      Properties var1 = new Properties();

      try (InputStream var2 = Files.newInputStream(var0)) {
         var1.load(var2);
      } catch (IOException var7) {
         class_.error("Failed to load properties from file: " + var0);
      }

      return var1;
   }

   protected abstract T class_(rVm_1 var1, Properties var2);

   protected Properties class_() {
      Properties var1 = new Properties();
      var1.putAll(this.break_);
      return var1;
   }

   private static <V extends Number> Function<String, V> class_(Function<String, V> var0) {
      return var1 -> {
         try {
            return (V)var0.apply(var1);
         } catch (NumberFormatException var3) {
            return null;
         }
      };
   }

   protected static <V> Function<String, V> class_(IntFunction<V> var0, Function<String, V> var1) {
      return var2 -> {
         try {
            return (V)var0.apply(Integer.parseInt(var2));
         } catch (NumberFormatException var4) {
            return (V)var1.apply(var2);
         }
      };
   }

   protected <V> V class_(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var5 = this.byte_(var1);
      Object var6 = MoreObjects.firstNonNull(var5 != null ? var2.apply(var5) : null, var4);
      this.break_.put(var1, var3.apply(var6));
      return (V)var6;
   }

   protected <V> V class_(String var1, Function<String, V> var2) {
      String var3 = this.byte_(var1);
      if (var3 == null) {
         return null;
      } else {
         this.break_.remove(var1);
         return (V)var2.apply(var3);
      }
   }

   protected String class_(String var1, String var2) {
      return this.class_(var1, Function.identity(), Function.identity(), var2);
   }

   protected <V> V class_(String var1, Function<String, V> var2, V var3) {
      return this.class_(var1, var2, Objects::toString, (V)var3);
   }

   protected <V> V class_(String var1, Function<String, V> var2, UnaryOperator<V> var3, Function<V, String> var4, V var5) {
      return this.class_(var1, var2x -> {
         Object var3x = var2.apply(var2x);
         return (V)(var3x != null ? var3.apply(var3x) : null);
      }, var4, (V)var5);
   }

   protected rnA_2<T>.celestial/rnn_3<Integer> break_(String var1, int var2) {
      return this.break_(var1, class_(Integer::parseInt), var2);
   }

   public void break_(Path var1) {
      try (OutputStream var2 = Files.newOutputStream(var1)) {
         this.break_.store(var2, "Minecraft server properties");
      } catch (IOException var7) {
         class_.error("Failed to store properties to file: " + var1);
      }
   }

   protected <V> rnA_2<T>.celestial/rnn_3<V> break_(String var1, Function<String, V> var2, V var3) {
      return this.break_(var1, var2, Objects::toString, (V)var3);
   }

   protected <V> rnA_2<T>.celestial/rnn_3<V> break_(String var1, Function<String, V> var2, Function<V, String> var3, V var4) {
      String var5 = this.byte_(var1);
      Object var6 = MoreObjects.firstNonNull(var5 != null ? var2.apply(var5) : null, var4);
      this.break_.put(var1, var3.apply(var6));
      return new rnn_3<V>(this, (V)var1, (Function<V, String>)var6, var3);
   }

   protected rnA_2<T>.celestial/rnn_3<Boolean> break_(String var1, boolean var2) {
      return this.break_(var1, Boolean::valueOf, var2);
   }

   protected Boolean break_(String var1) {
      return this.class_(var1, Boolean::valueOf);
   }
}
