package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;

final class rez_3 {
   private final rVL<reu_3> id_class;
   private final int id_break;
   private final reN_2 id_byte;
   private final rKd_1 id_protected;
   private final rrPt_1 id_throws;
   private final List<? super rel_3> id_case;
   private final Random id_catch;
   final Deque<reQ_2> id_private = Queues.newArrayDeque();

   rez_3(rVL<reu_3> var1, int var2, reN_2 var3, rKd_1 var4, rrPt_1 var5, List<? super rel_3> var6, Random var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   void id_class(rel_3 var1, MutableObject<rjC_2> var2, int var3, int var4, boolean var5) {
      rev_3 var6 = var1.id_break();
      rfH_2 var7 = var1.id_byte();
      rqd_3 var8 = var1.id_class();
      rem_3 var9 = var6.id_byte();
      boolean var10 = var9 == rem_3.RIGID;
      MutableObject var11 = new MutableObject();
      rfi_3 var12 = var1.id_catch();
      int var13 = var12.id_break;

      label138:
      for (rrPp_1 var15 : var6.id_class(this.id_throws, var7, var8, this.id_catch)) {
         rpr_3 var16 = kW_2.id_private(var15.id_break);
         rfH_2 var17 = var15.id_class;
         rfH_2 var18 = var17.id_break(var16);
         int var19 = var17.c_() - var13;
         int var20 = -1;
         rqO_2 var21 = new rqO_2(var15.id_byte.id_native("pool"));
         Optional var22 = this.id_class.id_break(var21);
         if (var22.isPresent() && (((reu_3)var22.get()).id_byte() != 0 || Objects.equals(var21, reZ_2.id_class.id_class()))) {
            rqO_2 var23 = ((reu_3)var22.get()).id_class();
            Optional var24 = this.id_class.id_break(var23);
            if (var24.isPresent() && (((reu_3)var24.get()).id_byte() != 0 || Objects.equals(var23, reZ_2.id_class.id_class()))) {
               boolean var25 = var12.id_break(var18);
               MutableObject var26;
               int var27;
               if (var25) {
                  var26 = var11;
                  var27 = var13;
                  if (var11.getValue() == null) {
                     var11.setValue(rjw_3.id_class(rfl_3.id_class(var12)));
                  }
               } else {
                  var26 = var2;
                  var27 = var3;
               }

               ArrayList var28 = Lists.newArrayList();
               if (var4 != this.id_break) {
                  var28.addAll(((reu_3)var22.get()).id_break(this.id_catch));
               }

               var28.addAll(((reu_3)var24.get()).id_break(this.id_catch));

               for (rev_3 var30 : var28) {
                  if (var30 == reJ_2.id_break) {
                     break;
                  }

                  for (rqd_3 var32 : rqd_3.id_break(this.id_catch)) {
                     List var33 = var30.id_class(this.id_throws, rfH_2.id_protected, var32, this.id_catch);
                     rfi_3 var34 = var30.id_class(this.id_throws, rfH_2.id_protected, var32);
                     int var35;
                     if (var5 && var34.id_throws() <= 16) {
                        var35 = var33.stream().mapToInt(var2x -> {
                           if (!var34.id_break(var2x.id_class.id_break(kW_2.id_private(var2x.id_break)))) {
                              return 0;
                           } else {
                              rqO_2 var3x = new rqO_2(var2x.id_byte.id_native("pool"));
                              Optional var4x = this.id_class.id_break(var3x);
                              Optional var5x = var4x.flatMap(var1xx -> this.id_class.id_break(var1xx.id_class()));
                              int var6x = var4x.<Integer>map(var1xx -> var1xx.id_class(this.id_throws)).orElse(0);
                              int var7x = var5x.<Integer>map(var1xx -> var1xx.id_class(this.id_throws)).orElse(0);
                              return Math.max(var6x, var7x);
                           }
                        }).max().orElse(0);
                     } else {
                        var35 = 0;
                     }

                     for (rrPp_1 var37 : var33) {
                        if (kW_2.id_class(var15, var37)) {
                           rfH_2 var38 = var37.id_class;
                           rfH_2 var39 = new rfH_2(var18.b_() - var38.b_(), var18.c_() - var38.c_(), var18.d_() - var38.d_());
                           rfi_3 var40 = var30.id_class(this.id_throws, var39, var32);
                           int var41 = var40.id_break;
                           rem_3 var42 = var30.id_byte();
                           boolean var43 = var42 == rem_3.RIGID;
                           int var44 = var38.c_();
                           int var45 = var19 - var44 + kW_2.id_private(var15.id_break).id_finally();
                           int var46;
                           if (var10 && var43) {
                              var46 = var13 + var45;
                           } else {
                              if (var20 == -1) {
                                 var20 = this.id_protected.id_break(var17.b_(), var17.d_(), rKv_1.WORLD_SURFACE_WG);
                              }

                              var46 = var20 - var44;
                           }

                           int var47 = var46 - var41;
                           rfi_3 var48 = var40.id_break(0, var47, 0);
                           rfH_2 var49 = var39.id_break(0, var47, 0);
                           if (var35 > 0) {
                              int var50 = Math.max(var35 + 1, var48.id_throws - var48.id_break);
                              var48.id_throws = var48.id_break + var50;
                           }

                           if (!rjw_3.id_byte((rjC_2)var26.getValue(), rjw_3.id_class(rfl_3.id_class(var48).id_break(0.25)), rjN_2.id_byte)) {
                              var26.setValue(rjw_3.id_break((rjC_2)var26.getValue(), rjw_3.id_class(rfl_3.id_class(var48)), rjN_2.id_throws));
                              int var54 = var1.id_protected();
                              int var51;
                              if (var43) {
                                 var51 = var54 - var45;
                              } else {
                                 var51 = var30.id_protected();
                              }

                              rel_3 var52 = this.id_byte.create(this.id_throws, var30, var49, var51, var32, var48);
                              int var53;
                              if (var10) {
                                 var53 = var13 + var19;
                              } else if (var43) {
                                 var53 = var46 + var44;
                              } else {
                                 if (var20 == -1) {
                                    var20 = this.id_protected.id_break(var17.b_(), var17.d_(), rKv_1.WORLD_SURFACE_WG);
                                 }

                                 var53 = var20 + var45 / 2;
                              }

                              var1.id_class(new rek_3(var18.b_(), var53 - var19 + var54, var18.d_(), var45, var42));
                              var52.id_class(new rek_3(var17.b_(), var53 - var44 + var51, var17.d_(), -var45, var9));
                              this.id_case.add(var52);
                              if (var4 + 1 <= this.id_break) {
                                 this.id_private.addLast(new reQ_2(var52, var26, var27, var4 + 1));
                              }
                              continue label138;
                           }
                        }
                     }
                  }
               }
            } else {
               reW_2.id_class.warn("Empty or none existent fallback pool: {}", var23);
            }
         } else {
            reW_2.id_class.warn("Empty or none existent pool: {}", var21);
         }
      }
   }
}
