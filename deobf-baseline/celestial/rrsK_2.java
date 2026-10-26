package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;

public class rrsK_2 extends rrsR_2<rrsU_2> {
   private static final rpr_3[] id_extends = new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST};
   private final LongSet id_native = new LongOpenHashSet();
   private final LongSet id_volatile = new LongOpenHashSet();
   private final LongSet id_final = new LongOpenHashSet();
   private final LongSet id_package = new LongOpenHashSet();
   private volatile boolean id_int;

   private void id_int(long var1) {
      this.id_final.add(var1);
      this.id_volatile.remove(var1);
   }

   protected rrsK_2(rol_3 var1) {
      super(rRo_1.SKY, var1, new rrsU_2(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected void id_class(rrsV_2<rrsU_2, ?> var1, boolean var2, boolean var3) {
      super.id_class(var1, var2, var3);
      if (var2) {
         if (!this.id_volatile.isEmpty()) {
            LongIterator var4 = this.id_volatile.iterator();

            while (var4.hasNext()) {
               long var5 = (Long)var4.next();
               int var7 = this.id_byte(var5);
               if (var7 != 2 && !this.id_final.contains(var5) && this.id_native.add(var5)) {
                  if (var7 == 1) {
                     this.id_class(var1, var5);
                     if (this.id_catch.add(var5)) {
                        this.id_case.id_class(var5);
                     }

                     Arrays.fill(this.id_class(var5, true).id_class(), (byte)-1);
                     int var26 = rjh_3.id_catch(rjh_3.id_break(var5));
                     int var28 = rjh_3.id_catch(rjh_3.id_byte(var5));
                     int var30 = rjh_3.id_catch(rjh_3.id_protected(var5));

                     for (rpr_3 var14 : id_extends) {
                        long var15 = rjh_3.id_class(var5, var14);
                        if ((this.id_final.contains(var15) || !this.id_native.contains(var15) && !this.id_volatile.contains(var15)) && this.id_catch(var15)) {
                           for (int var17 = 0; var17 < 16; var17++) {
                              for (int var18 = 0; var18 < 16; var18++) {
                                 long var19;
                                 long var21;
                                 switch (var14) {
                                    case NORTH:
                                       var19 = rfH_2.id_throws(var26 + var17, var28 + var18, var30);
                                       var21 = rfH_2.id_throws(var26 + var17, var28 + var18, var30 - 1);
                                       break;
                                    case SOUTH:
                                       var19 = rfH_2.id_throws(var26 + var17, var28 + var18, var30 + 16 - 1);
                                       var21 = rfH_2.id_throws(var26 + var17, var28 + var18, var30 + 16);
                                       break;
                                    case WEST:
                                       var19 = rfH_2.id_throws(var26, var28 + var17, var30 + var18);
                                       var21 = rfH_2.id_throws(var26 - 1, var28 + var17, var30 + var18);
                                       break;
                                    default:
                                       var19 = rfH_2.id_throws(var26 + 16 - 1, var28 + var17, var30 + var18);
                                       var21 = rfH_2.id_throws(var26 + 16, var28 + var17, var30 + var18);
                                 }

                                 var1.id_class(var19, var21, var1.id_break(var19, var21, 0), true);
                              }
                           }
                        }
                     }

                     for (int var31 = 0; var31 < 16; var31++) {
                        for (int var32 = 0; var32 < 16; var32++) {
                           long var33 = rfH_2.id_throws(
                              rjh_3.id_catch(rjh_3.id_break(var5)) + var31,
                              rjh_3.id_catch(rjh_3.id_byte(var5)),
                              rjh_3.id_catch(rjh_3.id_protected(var5)) + var32
                           );
                           long var34 = rfH_2.id_throws(
                              rjh_3.id_catch(rjh_3.id_break(var5)) + var31,
                              rjh_3.id_catch(rjh_3.id_byte(var5)) - 1,
                              rjh_3.id_catch(rjh_3.id_protected(var5)) + var32
                           );
                           var1.id_class(var33, var34, var1.id_break(var33, var34, 0), true);
                        }
                     }
                  } else {
                     for (int var8 = 0; var8 < 16; var8++) {
                        for (int var9 = 0; var9 < 16; var9++) {
                           long var10 = rfH_2.id_throws(
                              rjh_3.id_catch(rjh_3.id_break(var5)) + var8,
                              rjh_3.id_catch(rjh_3.id_byte(var5)) + 16 - 1,
                              rjh_3.id_catch(rjh_3.id_protected(var5)) + var9
                           );
                           var1.id_class(Long.MAX_VALUE, var10, 0, true);
                        }
                     }
                  }
               }
            }
         }

         this.id_volatile.clear();
         if (!this.id_final.isEmpty()) {
            LongIterator var23 = this.id_final.iterator();

            while (var23.hasNext()) {
               long var24 = (Long)var23.next();
               if (this.id_native.remove(var24) && this.id_catch(var24)) {
                  for (int var25 = 0; var25 < 16; var25++) {
                     for (int var27 = 0; var27 < 16; var27++) {
                        long var29 = rfH_2.id_throws(
                           rjh_3.id_catch(rjh_3.id_break(var24)) + var25,
                           rjh_3.id_catch(rjh_3.id_byte(var24)) + 16 - 1,
                           rjh_3.id_catch(rjh_3.id_protected(var24)) + var27
                        );
                        var1.id_class(Long.MAX_VALUE, var29, 15, false);
                     }
                  }
               }
            }
         }

         this.id_final.clear();
         this.id_int = false;
      }
   }

   @Override
   protected boolean id_class() {
      return super.id_class() || this.id_int;
   }

   @Override
   protected void id_break(long var1, boolean var3) {
      this.id_throws();
      if (var3 && this.id_package.add(var1)) {
         int var4 = this.id_case.id_byte.get(var1);
         if (var4 != this.id_case.id_break) {
            long var5 = rjh_3.id_break(rjh_3.id_break(var1), var4 - 1, rjh_3.id_protected(var1));
            this.id_new(var5);
            this.id_catch();
         }
      } else if (!var3) {
         this.id_package.remove(var1);
      }
   }

   protected boolean id_break(int var1) {
      return var1 >= this.id_case.id_break;
   }

   @Override
   protected roH_2 id_finally(long var1) {
      roH_2 var3 = (roH_2)this.id_implements.get(var1);
      if (var3 != null) {
         return var3;
      } else {
         long var4 = rjh_3.id_class(var1, rpr_3.UP);
         int var6 = this.id_case.id_byte.get(rjh_3.id_case(var1));
         if (var6 != this.id_case.id_break && rjh_3.id_byte(var4) < var6) {
            roH_2 var7;
            while ((var7 = this.id_class(var4, true)) == null) {
               var4 = rjh_3.id_class(var4, rpr_3.UP);
            }

            return new roH_2(new rrsg_3(var7, 0).id_class());
         } else {
            return new roH_2();
         }
      }
   }

   private void id_catch() {
      this.id_int = !this.id_volatile.isEmpty() || !this.id_final.isEmpty();
   }

   @Override
   protected void id_extends(long var1) {
      int var3 = rjh_3.id_byte(var1);
      if (this.id_case.id_break > var3) {
         this.id_case.id_break = var3;
         this.id_case.id_byte.defaultReturnValue(this.id_case.id_break);
      }

      long var4 = rjh_3.id_case(var1);
      int var6 = this.id_case.id_byte.get(var4);
      if (var6 < var3 + 1) {
         this.id_case.id_byte.put(var4, var3 + 1);
         if (this.id_package.contains(var4)) {
            this.id_new(var1);
            if (var6 > this.id_case.id_break) {
               long var7 = rjh_3.id_break(rjh_3.id_break(var1), var6 - 1, rjh_3.id_protected(var1));
               this.id_int(var7);
            }

            this.id_catch();
         }
      }
   }

   private void id_new(long var1) {
      this.id_volatile.add(var1);
      this.id_final.remove(var1);
   }

   protected boolean id_package(long var1) {
      long var3 = rjh_3.id_case(var1);
      return this.id_package.contains(var3);
   }

   @Override
   protected int id_protected(long var1) {
      long var3 = rjh_3.id_throws(var1);
      int var5 = rjh_3.id_byte(var3);
      rrsU_2 var6 = this.id_throws;
      int var7 = var6.id_byte.get(rjh_3.id_case(var3));
      if (var7 != var6.id_break && var5 < var7) {
         roH_2 var8 = this.id_class(var6, var3);
         if (var8 == null) {
            for (var1 = rfH_2.id_throws(var1); var8 == null; var8 = this.id_class(var6, var3)) {
               var3 = rjh_3.id_class(var3, rpr_3.UP);
               if (++var5 >= var7) {
                  return 15;
               }

               var1 = rfH_2.id_class(var1, 0, 16, 0);
            }
         }

         return var8.id_class(rjh_3.id_break(rfH_2.id_class(var1)), rjh_3.id_break(rfH_2.id_break(var1)), rjh_3.id_break(rfH_2.id_byte(var1)));
      } else {
         return 15;
      }
   }

   protected boolean id_final(long var1) {
      long var3 = rjh_3.id_case(var1);
      int var5 = this.id_case.id_byte.get(var3);
      return var5 == this.id_case.id_break || rjh_3.id_byte(var1) >= var5;
   }

   protected boolean id_volatile(long var1) {
      int var3 = rfH_2.id_break(var1);
      if ((var3 & 15) != 15) {
         return false;
      } else {
         long var4 = rjh_3.id_throws(var1);
         long var6 = rjh_3.id_case(var4);
         if (!this.id_package.contains(var6)) {
            return false;
         } else {
            int var8 = this.id_case.id_byte.get(var6);
            return rjh_3.id_catch(var8) == var3 + 16;
         }
      }
   }

   @Override
   protected void id_native(long var1) {
      long var3 = rjh_3.id_case(var1);
      boolean var5 = this.id_package.contains(var3);
      if (var5) {
         this.id_int(var1);
      }

      int var6 = rjh_3.id_byte(var1);
      if (this.id_case.id_byte.get(var3) == var6 + 1) {
         long var7;
         for (var7 = var1; !this.id_catch(var7) && this.id_break(var6); var7 = rjh_3.id_class(var7, rpr_3.DOWN)) {
            var6--;
         }

         if (this.id_catch(var7)) {
            this.id_case.id_byte.put(var3, var6 + 1);
            if (var5) {
               this.id_new(var7);
            }
         } else {
            this.id_case.id_byte.remove(var3);
         }
      }

      if (var5) {
         this.id_catch();
      }
   }
}
