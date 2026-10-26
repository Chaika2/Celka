package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class uG_2 implements AutoCloseable {
   private static final uE_2 class_ = new uE_2();
   private static final uX_2 break_ = () -> 4.0F;
   private static final Random byte_ = new Random();
   private final fY_2 protected_;
   private final rqO_2 throws_;
   private ud_3 case_;
   private ud_3 catch_;
   private final List<uc_3> private_ = Lists.newArrayList();
   private final Int2ObjectMap<ud_3> implements_ = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<uX_2> finally_ = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<IntList> extends_ = new Int2ObjectOpenHashMap();
   private final List<uO_2> native_ = Lists.newArrayList();

   private void byte_() {
      for (uO_2 var2 : this.native_) {
         var2.close();
      }

      this.native_.clear();
   }

   private uJ_2 byte_(int var1) {
      for (uc_3 var3 : this.private_) {
         uJ_2 var4 = var3.class_(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return us_3.INSTANCE;
   }

   public uG_2(fY_2 var1, rqO_2 var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public void class_(List<uc_3> var1) {
      this.break_();
      this.byte_();
      this.implements_.clear();
      this.finally_.clear();
      this.extends_.clear();
      this.case_ = this.class_((uJ_2)us_3.INSTANCE);
      this.catch_ = this.class_((uJ_2)uW_2.INSTANCE);
      IntOpenHashSet var2 = new IntOpenHashSet();

      for (uc_3 var4 : var1) {
         var2.addAll(var4.class_());
      }

      HashSet var5 = Sets.newHashSet();
      var2.forEach(var3 -> {
         for (uc_3 var5x : var1) {
            Object var6 = var3 == 32 ? break_ : var5x.class_(var3);
            if (var6 != null) {
               var5.add(var5x);
               if (var6 != us_3.INSTANCE) {
                  ((IntList)this.extends_.computeIfAbsent(rfU_2.case_(((uX_2)var6).class_(false)), var0 -> new IntArrayList())).add(var3);
               }
               break;
            }
         }
      });
      var1.stream().filter(var5::contains).forEach(this.private_::add);
   }

   private ud_3 class_(uJ_2 var1) {
      for (uO_2 var3 : this.native_) {
         ud_3 var4 = var3.class_(var1);
         if (var4 != null) {
            return var4;
         }
      }

      uO_2 var5 = new uO_2(new rqO_2(this.throws_.byte_(), this.throws_.break_() + "/" + this.native_.size()), var1.protected_());
      this.native_.add(var5);
      this.protected_.class_(var5.class_(), var5);
      ud_3 var6 = var5.class_(var1);
      return var6 == null ? this.case_ : var6;
   }

   public ud_3 class_() {
      return this.catch_;
   }

   public ud_3 class_(uX_2 var1) {
      IntList var2 = (IntList)this.extends_.get(rfU_2.case_(var1.class_(false)));
      return var2 != null && !var2.isEmpty() ? this.break_(var2.getInt(byte_.nextInt(var2.size()))) : this.case_;
   }

   public uX_2 class_(int var1) {
      Object var2 = (uX_2)this.finally_.get(var1);
      if (var2 == null) {
         if (var1 == 32) {
            var2 = break_;
         } else {
            var2 = this.byte_(var1);
         }

         this.finally_.put(var1, var2);
      }

      return (uX_2)var2;
   }

   @Override
   public void close() {
      this.break_();
      this.byte_();
   }

   public ud_3 break_(int var1) {
      Object var2 = (ud_3)this.implements_.get(var1);
      if (var2 == null) {
         if (var1 == 32) {
            var2 = class_;
         } else {
            var2 = this.class_(this.byte_(var1));
         }

         this.implements_.put(var1, var2);
      }

      return (ud_3)var2;
   }

   private void break_() {
      for (uc_3 var2 : this.private_) {
         var2.close();
      }

      this.private_.clear();
   }
}
