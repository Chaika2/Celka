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
   protected static final roH_2 id_class = new roH_2();
   private static final rpr_3[] id_extends = rpr_3.values();
   private final rRo_1 id_native;
   private final rol_3 id_volatile;
   protected final LongSet id_break = new LongOpenHashSet();
   protected final LongSet id_byte = new LongOpenHashSet();
   protected final LongSet id_protected = new LongOpenHashSet();
   protected volatile M id_throws;
   protected final M id_case;
   protected final LongSet id_catch = new LongOpenHashSet();
   protected final LongSet id_private = new LongOpenHashSet();
   protected final Long2ObjectMap<roH_2> id_implements = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet id_final = new LongOpenHashSet();
   private final LongSet id_package = new LongOpenHashSet();
   private final LongSet id_int = new LongOpenHashSet();
   protected volatile boolean id_finally;

   @Override
   protected int id_byte(long var1) {
      if (var1 == Long.MAX_VALUE) {
         return 2;
      } else if (this.id_break.contains(var1)) {
         return 0;
      } else {
         return !this.id_int.contains(var1) && this.id_case.id_break(var1) ? 1 : 2;
      }
   }

   public void id_byte(long var1, boolean var3) {
      if (var3) {
         this.id_package.add(var1);
      } else {
         this.id_package.remove(var1);
      }
   }

   protected rrsR_2(rRo_1 var1, rol_3 var2, M var3) {
      super(3, 16, 256);
      this.id_native = var1;
      this.id_volatile = var2;
      this.id_case = (M)var3;
      this.id_throws = (M)var3.id_break();
      this.id_throws.id_protected();
   }

   protected roH_2 id_class(M var1, long var2) {
      return var1.id_byte(var2);
   }

   protected roH_2 id_class(long var1, boolean var3) {
      return this.id_class(var3 ? this.id_case : this.id_throws, var1);
   }

   @Override
   protected void id_class(long var1, int var3) {
      int var4 = this.id_byte(var1);
      if (var4 != 0 && var3 == 0) {
         this.id_break.add(var1);
         this.id_protected.remove(var1);
      }

      if (var4 == 0 && var3 != 0) {
         this.id_break.remove(var1);
         this.id_byte.remove(var1);
      }

      if (var4 >= 2 && var3 != 2) {
         if (this.id_int.contains(var1)) {
            this.id_int.remove(var1);
         } else {
            this.id_case.id_class(var1, this.id_finally(var1));
            this.id_catch.add(var1);
            this.id_extends(var1);

            for (int var5 = -1; var5 <= 1; var5++) {
               for (int var6 = -1; var6 <= 1; var6++) {
                  for (int var7 = -1; var7 <= 1; var7++) {
                     this.id_private.add(rjh_3.id_throws(rfH_2.id_class(var1, var6, var7, var5)));
                  }
               }
            }
         }
      }

      if (var4 != 2 && var3 >= 2) {
         this.id_int.add(var1);
      }

      this.id_finally = !this.id_int.isEmpty();
   }

   protected void id_class(rrsV_2<M, ?> var1, boolean var2, boolean var3) {
      if (this.id_class() || !this.id_implements.isEmpty()) {
         LongIterator var4 = this.id_int.iterator();

         while (var4.hasNext()) {
            long var5 = (Long)var4.next();
            this.id_class(var1, var5);
            roH_2 var7 = (roH_2)this.id_implements.remove(var5);
            roH_2 var8 = this.id_case.id_protected(var5);
            if (this.id_package.contains(rjh_3.id_case(var5))) {
               if (var7 != null) {
                  this.id_implements.put(var5, var7);
               } else if (var8 != null) {
                  this.id_implements.put(var5, var8);
               }
            }
         }

         this.id_case.id_byte();
         var4 = this.id_int.iterator();

         while (var4.hasNext()) {
            long var14 = (Long)var4.next();
            this.id_native(var14);
         }

         this.id_int.clear();
         this.id_finally = false;
         ObjectIterator var10 = this.id_implements.long2ObjectEntrySet().iterator();

         while (var10.hasNext()) {
            Entry var15 = (Entry)var10.next();
            long var6 = var15.getLongKey();
            if (this.id_catch(var6)) {
               roH_2 var20 = (roH_2)var15.getValue();
               if (this.id_case.id_byte(var6) != var20) {
                  this.id_class(var1, var6);
                  this.id_case.id_class(var6, var20);
                  this.id_catch.add(var6);
               }
            }
         }

         this.id_case.id_byte();
         if (!var3) {
            var4 = this.id_implements.keySet().iterator();

            while (var4.hasNext()) {
               long var17 = (Long)var4.next();
               this.id_break(var1, var17);
            }
         } else {
            var4 = this.id_final.iterator();

            while (var4.hasNext()) {
               long var16 = (Long)var4.next();
               this.id_break(var1, var16);
            }
         }

         this.id_final.clear();
         ObjectIterator var13 = this.id_implements.long2ObjectEntrySet().iterator();

         while (var13.hasNext()) {
            Entry var18 = (Entry)var13.next();
            long var19 = var18.getLongKey();
            if (this.id_catch(var19)) {
               var13.remove();
            }
         }
      }
   }

   protected void id_class(rrsV_2<?, ?> var1, long var2) {
      if (var1.id_byte() < 8192) {
         var1.id_class(var2x -> rjh_3.id_throws(var2x) == var2);
      } else {
         int var4 = rjh_3.id_catch(rjh_3.id_break(var2));
         int var5 = rjh_3.id_catch(rjh_3.id_byte(var2));
         int var6 = rjh_3.id_catch(rjh_3.id_protected(var2));

         for (int var7 = 0; var7 < 16; var7++) {
            for (int var8 = 0; var8 < 16; var8++) {
               for (int var9 = 0; var9 < 16; var9++) {
                  long var10 = rfH_2.id_throws(var4 + var7, var5 + var8, var6 + var9);
                  var1.id_throws(var10);
               }
            }
         }
      }
   }

   protected boolean id_class() {
      return this.id_finally;
   }

   protected void id_class(long var1, roH_2 var3, boolean var4) {
      if (var3 != null) {
         this.id_implements.put(var1, var3);
         if (!var4) {
            this.id_final.add(var1);
         }
      } else {
         this.id_implements.remove(var1);
      }
   }

   private void id_break(rrsV_2<M, ?> var1, long var2) {
      if (this.id_catch(var2)) {
         int var4 = rjh_3.id_catch(rjh_3.id_break(var2));
         int var5 = rjh_3.id_catch(rjh_3.id_byte(var2));
         int var6 = rjh_3.id_catch(rjh_3.id_protected(var2));

         for (rpr_3 var10 : id_extends) {
            long var11 = rjh_3.id_class(var2, var10);
            if (!this.id_implements.containsKey(var11) && this.id_catch(var11)) {
               for (int var13 = 0; var13 < 16; var13++) {
                  for (int var14 = 0; var14 < 16; var14++) {
                     long var15;
                     long var17;
                     switch (var10) {
                        case DOWN:
                           var15 = rfH_2.id_throws(var4 + var14, var5, var6 + var13);
                           var17 = rfH_2.id_throws(var4 + var14, var5 - 1, var6 + var13);
                           break;
                        case UP:
                           var15 = rfH_2.id_throws(var4 + var14, var5 + 16 - 1, var6 + var13);
                           var17 = rfH_2.id_throws(var4 + var14, var5 + 16, var6 + var13);
                           break;
                        case NORTH:
                           var15 = rfH_2.id_throws(var4 + var13, var5 + var14, var6);
                           var17 = rfH_2.id_throws(var4 + var13, var5 + var14, var6 - 1);
                           break;
                        case SOUTH:
                           var15 = rfH_2.id_throws(var4 + var13, var5 + var14, var6 + 16 - 1);
                           var17 = rfH_2.id_throws(var4 + var13, var5 + var14, var6 + 16);
                           break;
                        case WEST:
                           var15 = rfH_2.id_throws(var4, var5 + var13, var6 + var14);
                           var17 = rfH_2.id_throws(var4 - 1, var5 + var13, var6 + var14);
                           break;
                        default:
                           var15 = rfH_2.id_throws(var4 + 16 - 1, var5 + var13, var6 + var14);
                           var17 = rfH_2.id_throws(var4 + 16, var5 + var13, var6 + var14);
                     }

                     var1.id_class(var15, var17, var1.id_break(var15, var17, var1.id_byte(var15)), false);
                     var1.id_class(var17, var15, var1.id_break(var17, var15, var1.id_byte(var17)), false);
                  }
               }
            }
         }
      }
   }

   protected void id_break(long var1, boolean var3) {
   }

   protected void id_break(long var1, int var3) {
      long var4 = rjh_3.id_throws(var1);
      if (this.id_catch.add(var4)) {
         this.id_case.id_class(var4);
      }

      roH_2 var6 = this.id_class(var4, true);
      var6.id_class(rjh_3.id_break(rfH_2.id_class(var1)), rjh_3.id_break(rfH_2.id_break(var1)), rjh_3.id_break(rfH_2.id_byte(var1)), var3);

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            for (int var9 = -1; var9 <= 1; var9++) {
               this.id_private.add(rjh_3.id_throws(rfH_2.id_class(var1, var8, var9, var7)));
            }
         }
      }
   }

   @Override
   protected int id_break(long var1) {
      if (this.id_byte.contains(var1)) {
         return 2;
      } else {
         return !this.id_break.contains(var1) && !this.id_protected.contains(var1) ? 2 : 0;
      }
   }

   protected void id_throws() {
      if (this.id_break()) {
         this.id_class(Integer.MAX_VALUE);
      }
   }

   protected roH_2 id_finally(long var1) {
      roH_2 var3 = (roH_2)this.id_implements.get(var1);
      return var3 != null ? var3 : new roH_2();
   }

   protected boolean id_catch(long var1) {
      return this.id_class(var1, true) != null;
   }

   protected void id_extends(long var1) {
   }

   protected void id_case() {
      if (!this.id_catch.isEmpty()) {
         rrsj_3 var1 = this.id_case.id_break();
         var1.id_protected();
         this.id_throws = (M)var1;
         this.id_catch.clear();
      }

      if (!this.id_private.isEmpty()) {
         LongIterator var4 = this.id_private.iterator();

         while (var4.hasNext()) {
            long var2 = var4.nextLong();
            this.id_volatile.id_class(this.id_native, rjh_3.id_class(var2));
         }

         this.id_private.clear();
      }
   }

   protected int id_implements(long var1) {
      long var3 = rjh_3.id_throws(var1);
      roH_2 var5 = this.id_class(var3, true);
      return var5.id_class(rjh_3.id_break(rfH_2.id_class(var1)), rjh_3.id_break(rfH_2.id_break(var1)), rjh_3.id_break(rfH_2.id_byte(var1)));
   }

   protected void id_protected(long var1, boolean var3) {
      boolean var4 = this.id_break.contains(var1);
      if (!var4 && !var3) {
         this.id_protected.add(var1);
         this.id_class(Long.MAX_VALUE, var1, 0, true);
      }

      if (var4 && var3) {
         this.id_byte.add(var1);
         this.id_class(Long.MAX_VALUE, var1, 2, false);
      }
   }

   protected abstract int id_protected(long var1);

   public roH_2 id_private(long var1) {
      roH_2 var3 = (roH_2)this.id_implements.get(var1);
      return var3 != null ? var3 : this.id_class(var1, false);
   }

   protected void id_native(long var1) {
   }
}
