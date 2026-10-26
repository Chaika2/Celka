package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class Ng_1 {
   final Map<rqO_2, NI> class_ = Maps.newHashMap();

   protected Ng_1() {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void class_(rqO_2 var1, NY var2, rAL var3) {
      NI var4 = this.class_.get(var1);
      boolean var5 = var4 == null;
      if (var5 || var2.break_()) {
         if (!var5) {
            Nf_1.break_.debug("Replaced sound event location {}", var1);
         }

         var4 = new NI(var1, var2.byte_());
         this.class_.put(var1, var4);
      }

      for (Nq_1 var7 : var2.class_()) {
         rqO_2 var8 = var7.byte_();
         Object var9;
         switch (var7.private_()) {
            case FILE:
               if (!Nf_1.class_(var7, var1, var3)) {
                  continue;
               }

               var9 = var7;
               break;
            case SOUND_EVENT:
               var9 = new NR(this, var8, var7);
               break;
            default:
               throw new IllegalStateException("Unknown SoundEventRegistration type: " + var7.private_());
         }

         var4.class_((Nc_1<Nq_1>)var9);
      }
   }

   public void class_(Map<rqO_2, NI> var1, Nt_1 var2) {
      var1.clear();

      for (Entry var4 : this.class_.entrySet()) {
         var1.put((rqO_2)var4.getKey(), (NI)var4.getValue());
         ((NI)var4.getValue()).class_(var2);
      }
   }
}
