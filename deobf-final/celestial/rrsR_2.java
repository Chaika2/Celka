package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public abstract class rrsR_2<M extends rrsj_3<M>> extends rqz_3 {
   protected static final roH_2 class_ = new roH_2();
   private static final rpr_3[] extends_ = rpr_3.values();
   private final rRo_1 native_;
   private final rol_3 volatile_;
   protected final LongSet break_ = new LongOpenHashSet();
   protected final LongSet byte_ = new LongOpenHashSet();
   protected final LongSet protected_ = new LongOpenHashSet();
   protected volatile M throws_;
   protected final M case_;
   protected final LongSet catch_ = new LongOpenHashSet();
   protected final LongSet private_ = new LongOpenHashSet();
   protected final Long2ObjectMap<roH_2> implements_ = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet final_ = new LongOpenHashSet();
   private final LongSet package_ = new LongOpenHashSet();
   private final LongSet int_ = new LongOpenHashSet();
   protected volatile boolean finally_;

   @Override
   protected int byte_(long var1) {
      if (var1 == Long.MAX_VALUE) {
         return 2;
      } else if (this.break_.contains(var1)) {
         return 0;
      } else {
         return !this.int_.contains(var1) && this.case_.break_(var1) ? 1 : 2;
      }
   }

   public void byte_(long var1, boolean var3) {
      if (var3) {
         this.package_.add(var1);
      } else {
         this.package_.remove(var1);
      }
   }

   protected rrsR_2(rRo_1 var1, rol_3 var2, M var3) {
      super(3, 16, 256);
      this.native_ = var1;
      this.volatile_ = var2;
      this.case_ = (M)var3;
      this.throws_ = (M)var3.break_();
      this.throws_.protected_();
   }

   protected roH_2 class_(M var1, long var2) {
      return var1.byte_(var2);
   }

   protected roH_2 class_(long var1, boolean var3) {
      return this.class_(var3 ? this.case_ : this.throws_, var1);
   }

   @Override
   protected void class_(long var1, int var3) {
      int var4 = this.byte_(var1);
      if (var4 != 0 && var3 == 0) {
         this.break_.add(var1);
         this.protected_.remove(var1);
      }

      if (var4 == 0 && var3 != 0) {
         this.break_.remove(var1);
         this.byte_.remove(var1);
      }

      if (var4 >= 2 && var3 != 2) {
         if (this.int_.contains(var1)) {
            this.int_.remove(var1);
         } else {
            this.case_.class_(var1, this.finally_(var1));
            this.catch_.add(var1);
            this.extends_(var1);

            for (int var5 = -1; var5 <= 1; var5++) {
               for (int var6 = -1; var6 <= 1; var6++) {
                  for (int var7 = -1; var7 <= 1; var7++) {
                     this.private_.add(rjh_3.throws_(rfH_2.class_(var1, var6, var7, var5)));
                  }
               }
            }
         }
      }

      if (var4 != 2 && var3 >= 2) {
         this.int_.add(var1);
      }

      this.finally_ = !this.int_.isEmpty();
   }

   protected void class_(rrsV_2<M, ?> var1, boolean var2, boolean var3) {
      if (this.class_() || !this.implements_.isEmpty()) {
         LongIterator var4 = this.int_.iterator();

         while (var4.hasNext()) {
            long var5 = (Long)var4.next();
            this.class_(var1, var5);
            roH_2 var7 = (roH_2)this.implements_.remove(var5);
            roH_2 var8 = this.case_.protected_(var5);
            if (this.package_.contains(rjh_3.case_(var5))) {
               if (var7 != null) {
                  this.implements_.put(var5, var7);
               } else if (var8 != null) {
                  this.implements_.put(var5, var8);
               }
            }
         }

         this.case_.byte_();
         var4 = this.int_.iterator();

         while (var4.hasNext()) {
            long var14 = (Long)var4.next();
            this.native_(var14);
         }

         this.int_.clear();
         this.finally_ = false;
         ObjectIterator var10 = this.implements_.long2ObjectEntrySet().iterator();

         while (var10.hasNext()) {
            Entry var15 = (Entry)var10.next();
            long var6 = var15.getLongKey();
            if (this.catch_(var6)) {
               roH_2 var20 = (roH_2)var15.getValue();
               if (this.case_.byte_(var6) != var20) {
                  this.class_(var1, var6);
                  this.case_.class_(var6, var20);
                  this.catch_.add(var6);
               }
            }
         }

         this.case_.byte_();
         if (!var3) {
            var4 = this.implements_.keySet().iterator();

            while (var4.hasNext()) {
               long var17 = (Long)var4.next();
               this.break_(var1, var17);
            }
         } else {
            var4 = this.final_.iterator();

            while (var4.hasNext()) {
               long var16 = (Long)var4.next();
               this.break_(var1, var16);
            }
         }

         this.final_.clear();
         ObjectIterator var13 = this.implements_.long2ObjectEntrySet().iterator();

         while (var13.hasNext()) {
            Entry var18 = (Entry)var13.next();
            long var19 = var18.getLongKey();
            if (this.catch_(var19)) {
               var13.remove();
            }
         }
      }
   }

   protected void class_(rrsV_2<?, ?> var1, long var2) {
      if (var1.byte_() < 8192) {
         var1.class_(var2x -> rjh_3.throws_(var2x) == var2);
      } else {
         int var4 = rjh_3.catch_(rjh_3.break_(var2));
         int var5 = rjh_3.catch_(rjh_3.byte_(var2));
         int var6 = rjh_3.catch_(rjh_3.protected_(var2));

         for (int var7 = 0; var7 < 16; var7++) {
            for (int var8 = 0; var8 < 16; var8++) {
               for (int var9 = 0; var9 < 16; var9++) {
                  long var10 = rfH_2.throws_(var4 + var7, var5 + var8, var6 + var9);
                  var1.throws_(var10);
               }
            }
         }
      }
   }

   protected boolean class_() {
      return this.finally_;
   }

   protected void class_(long var1, roH_2 var3, boolean var4) {
      if (var3 != null) {
         this.implements_.put(var1, var3);
         if (!var4) {
            this.final_.add(var1);
         }
      } else {
         this.implements_.remove(var1);
      }
   }

   private void break_(rrsV_2<M, ?> var1, long var2) {
      if (this.catch_(var2)) {
         int var4 = rjh_3.catch_(rjh_3.break_(var2));
         int var5 = rjh_3.catch_(rjh_3.byte_(var2));
         int var6 = rjh_3.catch_(rjh_3.protected_(var2));

         for (rpr_3 var10 : extends_) {
            long var11 = rjh_3.class_(var2, var10);
            if (!this.implements_.containsKey(var11) && this.catch_(var11)) {
               for (int var13 = 0; var13 < 16; var13++) {
                  for (int var14 = 0; var14 < 16; var14++) {
                     long var15;
                     long var17;
                     switch (var10) {
                        case DOWN:
                           var15 = rfH_2.throws_(var4 + var14, var5, var6 + var13);
                           var17 = rfH_2.throws_(var4 + var14, var5 - 1, var6 + var13);
                           break;
                        case UP:
                           var15 = rfH_2.throws_(var4 + var14, var5 + 16 - 1, var6 + var13);
                           var17 = rfH_2.throws_(var4 + var14, var5 + 16, var6 + var13);
                           break;
                        case NORTH:
                           var15 = rfH_2.throws_(var4 + var13, var5 + var14, var6);
                           var17 = rfH_2.throws_(var4 + var13, var5 + var14, var6 - 1);
                           break;
                        case SOUTH:
                           var15 = rfH_2.throws_(var4 + var13, var5 + var14, var6 + 16 - 1);
                           var17 = rfH_2.throws_(var4 + var13, var5 + var14, var6 + 16);
                           break;
                        case WEST:
                           var15 = rfH_2.throws_(var4, var5 + var13, var6 + var14);
                           var17 = rfH_2.throws_(var4 - 1, var5 + var13, var6 + var14);
                           break;
                        default:
                           var15 = rfH_2.throws_(var4 + 16 - 1, var5 + var13, var6 + var14);
                           var17 = rfH_2.throws_(var4 + 16, var5 + var13, var6 + var14);
                     }

                     var1.class_(var15, var17, var1.break_(var15, var17, var1.byte_(var15)), false);
                     var1.class_(var17, var15, var1.break_(var17, var15, var1.byte_(var17)), false);
                  }
               }
            }
         }
      }
   }

   protected void break_(long var1, boolean var3) {
   }

   protected void break_(long var1, int var3) {
      long var4 = rjh_3.throws_(var1);
      if (this.catch_.add(var4)) {
         this.case_.class_(var4);
      }

      roH_2 var6 = this.class_(var4, true);
      var6.class_(rjh_3.break_(rfH_2.class_(var1)), rjh_3.break_(rfH_2.break_(var1)), rjh_3.break_(rfH_2.byte_(var1)), var3);

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            for (int var9 = -1; var9 <= 1; var9++) {
               this.private_.add(rjh_3.throws_(rfH_2.class_(var1, var8, var9, var7)));
            }
         }
      }
   }

   @Override
   protected int break_(long var1) {
      if (this.byte_.contains(var1)) {
         return 2;
      } else {
         return !this.break_.contains(var1) && !this.protected_.contains(var1) ? 2 : 0;
      }
   }

   protected void throws_() {
      if (this.break_()) {
         this.class_(Integer.MAX_VALUE);
      }
   }

   protected roH_2 finally_(long var1) {
      roH_2 var3 = (roH_2)this.implements_.get(var1);
      return var3 != null ? var3 : new roH_2();
   }

   protected boolean catch_(long var1) {
      return this.class_(var1, true) != null;
   }

   protected void extends_(long var1) {
   }

   protected void case_() {
      if (!this.catch_.isEmpty()) {
         rrsj_3 var1 = this.case_.break_();
         var1.protected_();
         this.throws_ = (M)var1;
         this.catch_.clear();
      }

      if (!this.private_.isEmpty()) {
         LongIterator var4 = this.private_.iterator();

         while (var4.hasNext()) {
            long var2 = var4.nextLong();
            this.volatile_.class_(this.native_, rjh_3.class_(var2));
         }

         this.private_.clear();
      }
   }

   protected int implements_(long var1) {
      long var3 = rjh_3.throws_(var1);
      roH_2 var5 = this.class_(var3, true);
      return var5.class_(rjh_3.break_(rfH_2.class_(var1)), rjh_3.break_(rfH_2.break_(var1)), rjh_3.break_(rfH_2.byte_(var1)));
   }

   protected void protected_(long var1, boolean var3) {
      boolean var4 = this.break_.contains(var1);
      if (!var4 && !var3) {
         this.protected_.add(var1);
         this.class_(Long.MAX_VALUE, var1, 0, true);
      }

      if (var4 && var3) {
         this.byte_.add(var1);
         this.class_(Long.MAX_VALUE, var1, 2, false);
      }
   }

   protected abstract int protected_(long var1);

   public roH_2 private_(long var1) {
      roH_2 var3 = (roH_2)this.implements_.get(var1);
      return var3 != null ? var3 : this.class_(var1, false);
   }

   protected void native_(long var1) {
   }
}
