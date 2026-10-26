package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class rAj_1 implements rAv_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final Map<String, rAx_1> break_ = Maps.newHashMap();
   private final List<rAc_1> byte_ = Lists.newArrayList();
   private final List<rAc_1> protected_ = Lists.newArrayList();
   private final Set<String> throws_ = Sets.newLinkedHashSet();
   private final List<rAC> case_ = Lists.newArrayList();
   private final rAI catch_;

   private void byte_() {
      this.break_.clear();
      this.throws_.clear();
      this.case_.forEach(rAC::close);
      this.case_.clear();
   }

   @Override
   public List<rAF> byte_(rqO_2 var1) throws IOException {
      rAL var2 = this.break_.get(var1.byte_());
      if (var2 != null) {
         return var2.byte_(var1);
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   public rAj_1(rAI var1) {
      this.catch_ = var1;
   }

   @Override
   public void class_(rAc_1 var1) {
      this.byte_.add(var1);
      this.protected_.add(var1);
   }

   @Override
   public rAN class_(Executor var1, Executor var2, CompletableFuture<rqg_3> var3, List<rAC> var4) {
      this.byte_();
      class_.info("Reloading ResourceManager: {}", new Supplier[]{() -> var4.stream().map(rAC::class_).collect(Collectors.joining(", "))});

      for (rAC var6 : var4) {
         try {
            this.class_(var6);
         } catch (Exception var8) {
            class_.error("Failed to add resource pack {}", var6.class_(), var8);
            return new rAg_1(new rAV(var6, var8));
         }
      }

      return this.break_(var1, var2, this.byte_, var3);
   }

   @Override
   public rAF class_(rqO_2 var1) throws IOException {
      rAL var2 = this.break_.get(var1.byte_());
      if (var2 != null) {
         return var2.class_(var1);
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   @Override
   public Set<String> class_() {
      return this.throws_;
   }

   public void class_(rAC var1) {
      this.case_.add(var1);

      for (String var3 : var1.class_(this.catch_)) {
         this.throws_.add(var3);
         rAx_1 var4 = this.break_.get(var3);
         if (var4 == null) {
            var4 = new rAx_1(this.catch_, var3);
            this.break_.put(var3, var4);
         }

         var4.class_(var1);
      }
   }

   @Override
   public Collection<rqO_2> class_(String var1, Predicate<String> var2) {
      HashSet var3 = Sets.newHashSet();

      for (rAx_1 var5 : this.break_.values()) {
         var3.addAll(var5.class_(var1, var2));
      }

      ArrayList var6 = Lists.newArrayList(var3);
      Collections.sort(var6);
      return var6;
   }

   @Override
   public void close() {
      this.byte_();
   }

   @Override
   public Stream<rAC> break_() {
      return this.case_.stream();
   }

   protected rAN break_(Executor var1, Executor var2, List<rAc_1> var3, CompletableFuture<rqg_3> var4) {
      Object var5;
      if (class_.isDebugEnabled()) {
         var5 = new rAX(this, Lists.newArrayList(var3), var1, var2, var4);
      } else {
         var5 = rAE.class_(this, Lists.newArrayList(var3), var1, var2, var4);
      }

      this.protected_.clear();
      return (rAN)var5;
   }

   @Override
   public boolean break_(rqO_2 var1) {
      rAL var2 = this.break_.get(var1.byte_());
      return var2 != null ? var2.break_(var1) : false;
   }
}
