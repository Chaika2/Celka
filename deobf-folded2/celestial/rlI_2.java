package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlI_2 {
   private static final Logger id_class = LogManager.getLogger();
   private final rfH_2 id_break;
   private final rrEm_1 id_byte;
   private final rlT_2 id_protected;
   private final int id_throws;
   private final List<rle_3> id_case = Lists.newArrayList();
   private final Map<rle_3, rfH_2> id_catch = Maps.newHashMap();
   private final List<Pair<rlp_3, Collection<rle_3>>> id_private = Lists.newArrayList();
   private rlY_2 id_implements;
   private int id_finally = 0;
   private rfw_3 id_extends;

   public rlI_2(Collection<rlp_3> var1, rfH_2 var2, rqd_3 var3, rrEm_1 var4, rlT_2 var5, int var6) {
      this.id_extends = var2.id_new();
      this.id_break = var2;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      var1.forEach(var3x -> {
         ArrayList var4x = Lists.newArrayList();

         for (rlj_3 var6x : var3x.id_break()) {
            rle_3 var7 = new rle_3(var6x, var3, var4);
            var4x.add(var7);
            this.id_case.add(var7);
         }

         this.id_private.add(Pair.of(var3x, var4x));
      });
   }

   void id_class(rle_3 var1) {
      if (this.id_implements.id_catch()) {
         this.id_class(this.id_finally + 1);
      }
   }

   public List<rle_3> id_class() {
      return this.id_case;
   }

   private void id_class(Collection<rle_3> var1) {
      int var2 = 0;
      rfl_3 var3 = new rfl_3(this.id_extends);

      for (rle_3 var5 : var1) {
         rfH_2 var6 = new rfH_2(this.id_extends);
         ryG_2 var7 = rlH_2.id_class(var5.id_volatile(), var6, var5.id_final(), 2, this.id_byte, true);
         rfl_3 var8 = rlH_2.id_class(var7);
         var5.id_class(var7.id_char());
         this.id_catch.put(var5, new rfH_2(this.id_extends));
         var3 = var3.id_break(var8);
         this.id_extends.id_byte((int)var8.id_break() + 5, 0, 0);
         if (var2++ % this.id_throws == this.id_throws - 1) {
            this.id_extends.id_byte(0, 0, (int)var3.id_protected() + 6);
            this.id_extends.a_(this.id_break.b_());
            var3 = new rfl_3(this.id_extends);
         }
      }
   }

   private void id_class(int var1) {
      this.id_finally = var1;
      this.id_implements = new rlY_2();
      if (var1 < this.id_private.size()) {
         Pair var2 = this.id_private.get(this.id_finally);
         rlp_3 var3 = (rlp_3)var2.getFirst();
         Collection var4 = (Collection)var2.getSecond();
         this.id_class(var4);
         var3.id_class(this.id_byte);
         String var5 = var3.id_class();
         id_class.info("Running test batch '" + var5 + "' (" + var4.size() + " tests)...");
         var4.forEach(var1x -> {
            this.id_implements.id_class(var1x);
            this.id_implements.id_class(new rlf_3(this));
            rfH_2 var2x = this.id_catch.get(var1x);
            rHr_1.id_class(var1x, var2x, this.id_protected);
         });
      }
   }

   public void id_break() {
      this.id_class(0);
   }
}
