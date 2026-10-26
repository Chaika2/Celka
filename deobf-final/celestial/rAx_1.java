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
   static final Logger break_ = LogManager.getLogger();
   protected final List<rAC> class_ = Lists.newArrayList();
   private final rAI byte_;
   private final String protected_;

   @Override
   public List<rAF> byte_(rqO_2 var1) throws IOException {
      this.throws_(var1);
      ArrayList var2 = Lists.newArrayList();
      rqO_2 var3 = protected_(var1);

      for (rAC var5 : this.class_) {
         if (var5.break_(this.byte_, var1)) {
            InputStream var6 = var5.break_(this.byte_, var3) ? this.class_(var3, var5) : null;
            var2.add(new rAR(var5.class_(), var1, this.class_(var1, var5), var6));
         }
      }

      if (var2.isEmpty()) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var2;
      }
   }

   public rAx_1(rAI var1, String var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   public Collection<rqO_2> class_(String var1, Predicate<String> var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rAC var5 : this.class_) {
         var3.addAll(var5.class_(this.byte_, this.protected_, var1, Integer.MAX_VALUE, var2));
      }

      Collections.sort(var3);
      return var3;
   }

   public void class_(rAC var1) {
      this.class_.add(var1);
   }

   @Override
   public Set<String> class_() {
      return ImmutableSet.of(this.protected_);
   }

   @Override
   public rAF class_(rqO_2 var1) throws IOException {
      this.throws_(var1);
      rAC var2 = null;
      rqO_2 var3 = protected_(var1);

      for (int var4 = this.class_.size() - 1; var4 >= 0; var4--) {
         rAC var5 = this.class_.get(var4);
         if (var2 == null && var5.break_(this.byte_, var3)) {
            var2 = var5;
         }

         if (var5.break_(this.byte_, var1)) {
            InputStream var6 = null;
            if (var2 != null) {
               var6 = this.class_(var3, var2);
            }

            return new rAR(var5.class_(), var1, this.class_(var1, var5), var6);
         }
      }

      throw new FileNotFoundException(var1.toString());
   }

   protected InputStream class_(rqO_2 var1, rAC var2) throws IOException {
      InputStream var3 = var2.class_(this.byte_, var1);
      return (InputStream)(break_.isDebugEnabled() ? new rAd_1(var3, var1, var2.class_()) : var3);
   }

   @Override
   public Stream<rAC> break_() {
      return this.class_.stream();
   }

   @Override
   public boolean break_(rqO_2 var1) {
      if (!this.case_(var1)) {
         return false;
      } else {
         for (int var2 = this.class_.size() - 1; var2 >= 0; var2--) {
            rAC var3 = this.class_.get(var2);
            if (var3.break_(this.byte_, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   private void throws_(rqO_2 var1) throws IOException {
      if (!this.case_(var1)) {
         throw new IOException("Invalid relative path to resource: " + var1);
      }
   }

   private boolean case_(rqO_2 var1) {
      return !var1.break_().contains("..");
   }

   static rqO_2 protected_(rqO_2 var0) {
      return new rqO_2(var0.byte_(), var0.break_() + ".mcmeta");
   }
}
