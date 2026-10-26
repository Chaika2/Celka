package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAx_1 implements rAL {
   static final Logger id_break = LogManager.getLogger();
   protected final List<rAC> id_class = Lists.newArrayList();
   private final rAI id_byte;
   private final String id_protected;

   @Override
   public List<rAF> id_byte(rqO_2 var1) throws IOException {
      this.id_throws(var1);
      ArrayList var2 = Lists.newArrayList();
      rqO_2 var3 = id_protected(var1);

      for (rAC var5 : this.id_class) {
         if (var5.id_break(this.id_byte, var1)) {
            InputStream var6 = var5.id_break(this.id_byte, var3) ? this.id_class(var3, var5) : null;
            var2.add(new rAR(var5.id_class(), var1, this.id_class(var1, var5), var6));
         }
      }

      if (var2.isEmpty()) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var2;
      }
   }

   public rAx_1(rAI var1, String var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   public Collection<rqO_2> id_class(String var1, Predicate<String> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rAC var5 : this.id_class) {
         var3.addAll(var5.id_class(this.id_byte, this.id_protected, var1, Integer.MAX_VALUE, var2));
      }

      Collections.sort(var3);
      return var3;
   }

   public void id_class(rAC var1) {
      this.id_class.add(var1);
   }

   @Override
   public Set<String> id_class() {
      return ImmutableSet.of(this.id_protected);
   }

   @Override
   public rAF id_class(rqO_2 var1) throws IOException {
      this.id_throws(var1);
      rAC var2 = null;
      rqO_2 var3 = id_protected(var1);

      for (int var4 = this.id_class.size() - 1; var4 >= 0; var4--) {
         rAC var5 = this.id_class.get(var4);
         if (var2 == null && var5.id_break(this.id_byte, var3)) {
            var2 = var5;
         }

         if (var5.id_break(this.id_byte, var1)) {
            InputStream var6 = null;
            if (var2 != null) {
               var6 = this.id_class(var3, var2);
            }

            return new rAR(var5.id_class(), var1, this.id_class(var1, var5), var6);
         }
      }

      throw new FileNotFoundException(var1.toString());
   }

   protected InputStream id_class(rqO_2 var1, rAC var2) throws IOException {
      InputStream var3 = var2.id_class(this.id_byte, var1);
      return (InputStream)(id_break.isDebugEnabled() ? new rAd_1(var3, var1, var2.id_class()) : var3);
   }

   @Override
   public Stream<rAC> id_break() {
      return this.id_class.stream();
   }

   @Override
   public boolean id_break(rqO_2 var1) {
      if (!this.id_case(var1)) {
         return false;
      } else {
         for (int var2 = this.id_class.size() - 1; var2 >= 0; var2--) {
            rAC var3 = this.id_class.get(var2);
            if (var3.id_break(this.id_byte, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   private void id_throws(rqO_2 var1) throws IOException {
      if (!this.id_case(var1)) {
         throw new IOException("Invalid relative path to resource: " + var1);
      }
   }

   private boolean id_case(rqO_2 var1) {
      return !var1.id_break().contains("..");
   }

   static rqO_2 id_protected(rqO_2 var0) {
      return new rqO_2(var0.id_byte(), var0.id_break() + ".mcmeta");
   }
}
