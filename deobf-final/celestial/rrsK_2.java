package celestial;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;

public class rrsK_2 extends rrsR_2<rrsU_2> {
   private static final rpr_3[] extends_ = new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST};
   private final LongSet native_ = new LongOpenHashSet();
   private final LongSet volatile_ = new LongOpenHashSet();
   private final LongSet final_ = new LongOpenHashSet();
   private final LongSet package_ = new LongOpenHashSet();
   private volatile boolean int_;

   private void int_(long var1) {
      this.final_.add(var1);
      this.volatile_.remove(var1);
   }

   protected rrsK_2(rol_3 var1) {
      super(rRo_1.SKY, var1, new rrsU_2(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected void class_(rrsV_2<rrsU_2, ?> var1, boolean var2, boolean var3) {
      super.class_(var1, var2, var3);
      if (var2) {
         if (!this.volatile_.isEmpty()) {
            LongIterator var4 = this.volatile_.iterator();

            while (var4.hasNext()) {
               long var5 = (Long)var4.next();
               int var7 = this.byte_(var5);
               if (var7 != 2 && !this.final_.contains(var5) && this.native_.add(var5)) {
                  if (var7 == 1) {
                     this.class_(var1, var5);
                     if (this.catch_.add(var5)) {
                        this.case_.class_(var5);
                     }

                     Arrays.fill(this.class_(var5, true).class_(), (byte)-1);
                     int var26 = rjh_3.catch_(rjh_3.break_(var5));
                     int var28 = rjh_3.catch_(rjh_3.byte_(var5));
                     int var30 = rjh_3.catch_(rjh_3.protected_(var5));

                     for (rpr_3 var14 : extends_) {
                        long var15 = rjh_3.class_(var5, var14);
                        if ((this.final_.contains(var15) || !this.native_.contains(var15) && !this.volatile_.contains(var15)) && this.catch_(var15)) {
                           for (int var17 = 0; var17 < 16; var17++) {
                              for (int var18 = 0; var18 < 16; var18++) {
                                 long var19;
                                 long var21;
                                 switch (var14) {
                                    case NORTH:
                                       var19 = rfH_2.throws_(var26 + var17, var28 + var18, var30);
                                       var21 = rfH_2.throws_(var26 + var17, var28 + var18, var30 - 1);
                                       break;
                                    case SOUTH:
                                       var19 = rfH_2.throws_(var26 + var17, var28 + var18, var30 + 16 - 1);
                                       var21 = rfH_2.throws_(var26 + var17, var28 + var18, var30 + 16);
                                       break;
                                    case WEST:
                                       var19 = rfH_2.throws_(var26, var28 + var17, var30 + var18);
                                       var21 = rfH_2.throws_(var26 - 1, var28 + var17, var30 + var18);
                                       break;
                                    default:
                                       var19 = rfH_2.throws_(var26 + 16 - 1, var28 + var17, var30 + var18);
                                       var21 = rfH_2.throws_(var26 + 16, var28 + var17, var30 + var18);
                                 }

                                 var1.class_(var19, var21, var1.break_(var19, var21, 0), true);
                              }
                           }
                        }
                     }

                     for (int var31 = 0; var31 < 16; var31++) {
                        for (int var32 = 0; var32 < 16; var32++) {
                           long var33 = rfH_2.throws_(
                              rjh_3.catch_(rjh_3.break_(var5)) + var31, rjh_3.catch_(rjh_3.byte_(var5)), rjh_3.catch_(rjh_3.protected_(var5)) + var32
                           );
                           long var34 = rfH_2.throws_(
                              rjh_3.catch_(rjh_3.break_(var5)) + var31, rjh_3.catch_(rjh_3.byte_(var5)) - 1, rjh_3.catch_(rjh_3.protected_(var5)) + var32
                           );
                           var1.class_(var33, var34, var1.break_(var33, var34, 0), true);
                        }
                     }
                  } else {
                     for (int var8 = 0; var8 < 16; var8++) {
                        for (int var9 = 0; var9 < 16; var9++) {
                           long var10 = rfH_2.throws_(
                              rjh_3.catch_(rjh_3.break_(var5)) + var8, rjh_3.catch_(rjh_3.byte_(var5)) + 16 - 1, rjh_3.catch_(rjh_3.protected_(var5)) + var9
                           );
                           var1.class_(Long.MAX_VALUE, var10, 0, true);
                        }
                     }
                  }
               }
            }
         }

         this.volatile_.clear();
         if (!this.final_.isEmpty()) {
            LongIterator var23 = this.final_.iterator();

            while (var23.hasNext()) {
               long var24 = (Long)var23.next();
               if (this.native_.remove(var24) && this.catch_(var24)) {
                  for (int var25 = 0; var25 < 16; var25++) {
                     for (int var27 = 0; var27 < 16; var27++) {
                        long var29 = rfH_2.throws_(
                           rjh_3.catch_(rjh_3.break_(var24)) + var25, rjh_3.catch_(rjh_3.byte_(var24)) + 16 - 1, rjh_3.catch_(rjh_3.protected_(var24)) + var27
                        );
                        var1.class_(Long.MAX_VALUE, var29, 15, false);
                     }
                  }
               }
            }
         }

         this.final_.clear();
         this.int_ = false;
      }
   }

   @Override
   protected boolean class_() {
      return super.class_() || this.int_;
   }

   @Override
   protected void break_(long var1, boolean var3) {
      this.throws_();
      if (var3 && this.package_.add(var1)) {
         int var4 = this.case_.byte_.get(var1);
         if (var4 != this.case_.break_) {
            long var5 = rjh_3.break_(rjh_3.break_(var1), var4 - 1, rjh_3.protected_(var1));
            this.new_(var5);
            this.catch_();
         }
      } else if (!var3) {
         this.package_.remove(var1);
      }
   }

   protected boolean break_(int var1) {
      return var1 >= this.case_.break_;
   }

   @Override
   protected roH_2 finally_(long var1) {
      roH_2 var3 = (roH_2)this.implements_.get(var1);
      if (var3 != null) {
         return var3;
      } else {
         long var4 = rjh_3.class_(var1, rpr_3.UP);
         int var6 = this.case_.byte_.get(rjh_3.case_(var1));
         if (var6 != this.case_.break_ && rjh_3.byte_(var4) < var6) {
            roH_2 var7;
            while ((var7 = this.class_(var4, true)) == null) {
               var4 = rjh_3.class_(var4, rpr_3.UP);
            }

            return new roH_2(new rrsg_3(var7, 0).class_());
         } else {
            return new roH_2();
         }
      }
   }

   private void catch_() {
      this.int_ = !this.volatile_.isEmpty() || !this.final_.isEmpty();
   }

   @Override
   protected void extends_(long var1) {
      int var3 = rjh_3.byte_(var1);
      if (this.case_.break_ > var3) {
         this.case_.break_ = var3;
         this.case_.byte_.defaultReturnValue(this.case_.break_);
      }

      long var4 = rjh_3.case_(var1);
      int var6 = this.case_.byte_.get(var4);
      if (var6 < var3 + 1) {
         this.case_.byte_.put(var4, var3 + 1);
         if (this.package_.contains(var4)) {
            this.new_(var1);
            if (var6 > this.case_.break_) {
               long var7 = rjh_3.break_(rjh_3.break_(var1), var6 - 1, rjh_3.protected_(var1));
               this.int_(var7);
            }

            this.catch_();
         }
      }
   }

   private void new_(long var1) {
      this.volatile_.add(var1);
      this.final_.remove(var1);
   }

   protected boolean package_(long var1) {
      long var3 = rjh_3.case_(var1);
      return this.package_.contains(var3);
   }

   @Override
   protected int protected_(long var1) {
      long var3 = rjh_3.throws_(var1);
      int var5 = rjh_3.byte_(var3);
      rrsU_2 var6 = this.throws_;
      int var7 = var6.byte_.get(rjh_3.case_(var3));
      if (var7 != var6.break_ && var5 < var7) {
         roH_2 var8 = this.class_(var6, var3);
         if (var8 == null) {
            for (var1 = rfH_2.throws_(var1); var8 == null; var8 = this.class_(var6, var3)) {
               var3 = rjh_3.class_(var3, rpr_3.UP);
               if (++var5 >= var7) {
                  return 15;
               }

               var1 = rfH_2.class_(var1, 0, 16, 0);
            }
         }

         return var8.class_(rjh_3.break_(rfH_2.class_(var1)), rjh_3.break_(rfH_2.break_(var1)), rjh_3.break_(rfH_2.byte_(var1)));
      } else {
         return 15;
      }
   }

   protected boolean final_(long var1) {
      long var3 = rjh_3.case_(var1);
      int var5 = this.case_.byte_.get(var3);
      return var5 == this.case_.break_ || rjh_3.byte_(var1) >= var5;
   }

   protected boolean volatile_(long var1) {
      int var3 = rfH_2.break_(var1);
      if ((var3 & 15) != 15) {
         return false;
      } else {
         long var4 = rjh_3.throws_(var1);
         long var6 = rjh_3.case_(var4);
         if (!this.package_.contains(var6)) {
            return false;
         } else {
            int var8 = this.case_.byte_.get(var6);
            return rjh_3.catch_(var8) == var3 + 16;
         }
      }
   }

   @Override
   protected void native_(long var1) {
      long var3 = rjh_3.case_(var1);
      boolean var5 = this.package_.contains(var3);
      if (var5) {
         this.int_(var1);
      }

      int var6 = rjh_3.byte_(var1);
      if (this.case_.byte_.get(var3) == var6 + 1) {
         long var7;
         for (var7 = var1; !this.catch_(var7) && this.break_(var6); var7 = rjh_3.class_(var7, rpr_3.DOWN)) {
            var6--;
         }

         if (this.catch_(var7)) {
            this.case_.byte_.put(var3, var6 + 1);
            if (var5) {
               this.new_(var7);
            }
         } else {
            this.case_.byte_.remove(var3);
         }
      }

      if (var5) {
         this.catch_();
      }
   }
}
