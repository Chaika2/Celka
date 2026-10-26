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
   private static final Logger id_class = LogManager.getLogger();
   private final Map<String, rAx_1> id_break = Maps.newHashMap();
   private final List<rAc_1> id_byte = Lists.newArrayList();
   private final List<rAc_1> id_protected = Lists.newArrayList();
   private final Set<String> id_throws = Sets.newLinkedHashSet();
   private final List<rAC> id_case = Lists.newArrayList();
   private final rAI id_catch;

   private void id_byte() {
      this.id_break.clear();
      this.id_throws.clear();
      this.id_case.forEach(rAC::close);
      this.id_case.clear();
   }

   @Override
   public List<rAF> id_byte(rqO_2 var1) throws IOException {
      rAL var2 = this.id_break.get(var1.id_byte());
      if (var2 != null) {
         return var2.id_byte(var1);
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   public rAj_1(rAI var1) {
      this.id_catch = var1;
   }

   @Override
   public void id_class(rAc_1 var1) {
      this.id_byte.add(var1);
      this.id_protected.add(var1);
   }

   @Override
   public rAN id_class(Executor var1, Executor var2, CompletableFuture<rqg_3> var3, List<rAC> var4) {
      this.id_byte();
      id_class.info("Reloading ResourceManager: {}", new Supplier[]{() -> var4.stream().map(rAC::id_class).collect(Collectors.joining(", "))});

      for (rAC var6 : var4) {
         try {
            this.id_class(var6);
         } catch (Exception var8) {
            id_class.error("Failed to add resource pack {}", var6.id_class(), var8);
            return new rAg_1(new rAV(var6, var8));
         }
      }

      return this.id_break(var1, var2, this.id_byte, var3);
   }

   @Override
   public rAF id_class(rqO_2 var1) throws IOException {
      rAL var2 = this.id_break.get(var1.id_byte());
      if (var2 != null) {
         return var2.id_class(var1);
      } else {
         throw new FileNotFoundException(var1.toString());
      }
   }

   @Override
   public Set<String> id_class() {
      return this.id_throws;
   }

   public void id_class(rAC var1) {
      this.id_case.add(var1);

      for (String var3 : var1.id_class(this.id_catch)) {
         this.id_throws.add(var3);
         rAx_1 var4 = this.id_break.get(var3);
         if (var4 == null) {
            var4 = new rAx_1(this.id_catch, var3);
            this.id_break.put(var3, var4);
         }

         var4.id_class(var1);
      }
   }

   @Override
   public Collection<rqO_2> id_class(String var1, Predicate<String> var2) {
      HashSet var3 = Sets.newHashSet();

      for (rAx_1 var5 : this.id_break.values()) {
         var3.addAll(var5.id_class(var1, var2));
      }

      ArrayList var6 = Lists.newArrayList(var3);
      Collections.sort(var6);
      return var6;
   }

   @Override
   public void close() {
      this.id_byte();
   }

   @Override
   public Stream<rAC> id_break() {
      return this.id_case.stream();
   }

   protected rAN id_break(Executor var1, Executor var2, List<rAc_1> var3, CompletableFuture<rqg_3> var4) {
      Object var5;
      if (id_class.isDebugEnabled()) {
         var5 = new rAX(this, Lists.newArrayList(var3), var1, var2, var4);
      } else {
         var5 = rAE.id_class(this, Lists.newArrayList(var3), var1, var2, var4);
      }

      this.id_protected.clear();
      return (rAN)var5;
   }

   @Override
   public boolean id_break(rqO_2 var1) {
      rAL var2 = this.id_break.get(var1.id_byte());
      return var2 != null ? var2.id_break(var1) : false;
   }
}
