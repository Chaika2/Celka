/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMi_1;
import celestial.rrOA;
import celestial.rrOB;
import celestial.rrOC;
import celestial.rrOD;
import celestial.rrOE;
import celestial.rrOF;
import celestial.rrOH;
import celestial.rrOI;
import celestial.rrOJ;
import celestial.rrOK;
import celestial.rrOL;
import celestial.rrOM;
import celestial.rrON;
import celestial.rrOO;
import celestial.rrOP;
import celestial.rrOQ;
import celestial.rrOR;
import celestial.rrOS;
import celestial.rrOT;
import celestial.rrOU;
import celestial.rrOV;
import celestial.rrOW;
import celestial.rrOX;
import celestial.rrOZ;
import celestial.rrOa_1;
import celestial.rrOb_1;
import celestial.rrOc_1;
import celestial.rrOd_1;
import celestial.rrOe_1;
import celestial.rrOf_1;
import celestial.rrOg_1;
import celestial.rrOh_1;
import celestial.rrOi_1;
import celestial.rrOj_1;
import celestial.rrOk_1;
import celestial.rrOl_1;
import celestial.rrOm_1;
import celestial.rrOn_1;
import celestial.rrOo_1;
import celestial.rrOp_1;
import celestial.rrOq_1;
import celestial.rrOr_1;
import celestial.rrOs_1;
import celestial.rrOt_1;
import celestial.rrOu_1;
import celestial.rrOv_1;
import celestial.rrOw_1;
import celestial.rrOx_1;
import celestial.rrOy_1;
import celestial.rrOz_1;
import celestial.rrWQ;
import celestial.rrXB;
import celestial.rrXE;
import celestial.rrXG;
import celestial.rrXM;
import celestial.rrXP;
import celestial.rrXS;
import celestial.rrXb_1;
import celestial.rrXr_1;
import celestial.rrXs_1;
import celestial.rrbb_3;
import celestial.rrhA_2;
import celestial.rrhB_2;
import celestial.rrhC_2;
import celestial.rrhD_2;
import celestial.rrhE_2;
import celestial.rrhF_2;
import celestial.rrhG_2;
import celestial.rrhH_2;
import celestial.rrhI_2;
import celestial.rrhJ_2;
import celestial.rrhK_2;
import celestial.rrhL_2;
import celestial.rrhM_2;
import celestial.rrhN_2;
import celestial.rrhO_2;
import celestial.rrhP_2;
import celestial.rrhQ_2;
import celestial.rrhR_2;
import celestial.rrhS_2;
import celestial.rrhT_2;
import celestial.rrhU_2;
import celestial.rrhV_2;
import celestial.rrhW_2;
import celestial.rrhX_2;
import celestial.rrhY_2;
import celestial.rrhZ_2;
import celestial.rrha_3;
import celestial.rrhb_3;
import celestial.rrhc_3;
import celestial.rrhd_3;
import celestial.rrhe_3;
import celestial.rrhf_3;
import celestial.rrhg_3;
import celestial.rrhh_3;
import celestial.rrhi_3;
import celestial.rrhj_3;
import celestial.rrhk_3;
import celestial.rrhl_3;
import celestial.rrhm_3;
import celestial.rrhn_3;
import celestial.rrho_3;
import celestial.rrhp_3;
import celestial.rrhq_3;
import celestial.rrhr_3;
import celestial.rrhs_3;
import celestial.rrht_3;
import celestial.rrhv_3;
import celestial.rrhw_3;
import celestial.rrhx_3;
import celestial.rrhy_3;
import celestial.rrhz_3;
import celestial.ryW_2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class rrMD {
    private static Map<String, rrMi_1> id_class = rrMD.id_break();

    private static void id_class(Map<String, rrMi_1> map, rrMi_1 rrMi_12, String string) {
        if (map.containsKey(string)) {
            Object object = "?";
            rrWQ<aI_2, ryW_2> rrWQ2 = rrMi_12.id_class();
            if (rrWQ2.id_class().isPresent()) {
                object = rrWQ2.id_class().get().id_private();
            }
            if (rrWQ2.id_break().isPresent()) {
                object = "" + ryW_2.id_class(rrWQ2.id_break().get());
            }
            rrbb_3.id_protected("Model adapter already registered for id: " + string + ", type: " + (String)object);
        }
        map.put(string, rrMi_12);
    }

    public static String[] id_class() {
        Set<String> set = id_class.keySet();
        return set.toArray(new String[set.size()]);
    }

    public static rrMi_1 id_class(String string) {
        return id_class.get(string);
    }

    private static void id_class(Map<String, rrMi_1> map, rrMi_1 rrMi_12) {
        Object object;
        rrMD.id_class(map, rrMi_12, rrMi_12.id_break());
        String[] stringArray = rrMi_12.id_byte();
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; ++i) {
                object = stringArray[i];
                rrMD.id_class(map, rrMi_12, (String)object);
            }
        }
        In_1 in_1 = rrMi_12.id_throws();
        object = rrMi_12.id_case();
        for (int i = 0; i < ((String[])object).length; ++i) {
            String string = object[i];
            Iq_1 iq_1 = rrMi_12.id_class(in_1, string);
            if (iq_1 != null) continue;
            rrbb_3.id_protected("Model renderer not found, model: " + rrMi_12.id_break() + ", name: " + string);
        }
    }

    private static Map<String, rrMi_1> id_break() {
        LinkedHashMap<String, rrMi_1> linkedHashMap = new LinkedHashMap<String, rrMi_1>();
        rrMD.id_class(linkedHashMap, new rrOr_1());
        rrMD.id_class(linkedHashMap, new rrOB());
        rrMD.id_class(linkedHashMap, new rrOs_1());
        rrMD.id_class(linkedHashMap, new rrOb_1());
        rrMD.id_class(linkedHashMap, new rrOM());
        rrMD.id_class(linkedHashMap, new rrOJ());
        rrMD.id_class(linkedHashMap, new rrOk_1());
        rrMD.id_class(linkedHashMap, new rrOX());
        rrMD.id_class(linkedHashMap, new rrOQ());
        rrMD.id_class(linkedHashMap, new rrOW());
        rrMD.id_class(linkedHashMap, new rrON());
        rrMD.id_class(linkedHashMap, new rrOm_1());
        rrMD.id_class(linkedHashMap, new rrOu_1());
        rrMD.id_class(linkedHashMap, new rrOc_1());
        rrMD.id_class(linkedHashMap, new rrOZ());
        rrMD.id_class(linkedHashMap, new rrOv_1());
        rrMD.id_class(linkedHashMap, new rrOL());
        rrMD.id_class(linkedHashMap, new rrOA());
        rrMD.id_class(linkedHashMap, new rrOn_1());
        rrMD.id_class(linkedHashMap, new rrOC());
        rrMD.id_class(linkedHashMap, new rrOl_1());
        rrMD.id_class(linkedHashMap, new rrOH());
        rrMD.id_class(linkedHashMap, new rrOy_1());
        rrMD.id_class(linkedHashMap, new rrOp_1());
        rrMD.id_class(linkedHashMap, new rrOq_1());
        rrMD.id_class(linkedHashMap, new rrOV());
        rrMD.id_class(linkedHashMap, new rrOg_1());
        rrMD.id_class(linkedHashMap, new rrOR());
        rrMD.id_class(linkedHashMap, new rrOo_1());
        rrMD.id_class(linkedHashMap, new rrOK());
        rrMD.id_class(linkedHashMap, new rrOD());
        rrMD.id_class(linkedHashMap, new rrOU());
        rrMD.id_class(linkedHashMap, new rrOa_1());
        rrMD.id_class(linkedHashMap, new rrOi_1());
        rrMD.id_class(linkedHashMap, new rrhr_3());
        rrMD.id_class(linkedHashMap, new rrhP_2());
        rrMD.id_class(linkedHashMap, new rrhB_2());
        rrMD.id_class(linkedHashMap, new rrhS_2());
        rrMD.id_class(linkedHashMap, new rrhs_3());
        rrMD.id_class(linkedHashMap, new rrhG_2());
        rrMD.id_class(linkedHashMap, new rrhE_2());
        rrMD.id_class(linkedHashMap, new rrhb_3());
        rrMD.id_class(linkedHashMap, new rrhM_2());
        rrMD.id_class(linkedHashMap, new rrhO_2());
        rrMD.id_class(linkedHashMap, new rrhh_3());
        rrMD.id_class(linkedHashMap, new rrhX_2());
        rrMD.id_class(linkedHashMap, new rrhJ_2());
        rrMD.id_class(linkedHashMap, new rrhx_3());
        rrMD.id_class(linkedHashMap, new rrhd_3());
        rrMD.id_class(linkedHashMap, new rrhk_3());
        rrMD.id_class(linkedHashMap, new rrhz_3());
        rrMD.id_class(linkedHashMap, new rrhW_2());
        rrMD.id_class(linkedHashMap, new rrhQ_2());
        rrMD.id_class(linkedHashMap, new rrhN_2());
        rrMD.id_class(linkedHashMap, new rrhc_3());
        rrMD.id_class(linkedHashMap, new rrhm_3());
        rrMD.id_class(linkedHashMap, new rrhZ_2());
        rrMD.id_class(linkedHashMap, new rrhv_3());
        rrMD.id_class(linkedHashMap, new rrhF_2());
        rrMD.id_class(linkedHashMap, new rrhA_2());
        rrMD.id_class(linkedHashMap, new rrhC_2());
        rrMD.id_class(linkedHashMap, new rrhH_2());
        rrMD.id_class(linkedHashMap, new rrhy_3());
        rrMD.id_class(linkedHashMap, new rrhp_3());
        rrMD.id_class(linkedHashMap, new rrhq_3());
        rrMD.id_class(linkedHashMap, new rrhT_2());
        rrMD.id_class(linkedHashMap, new rrht_3());
        rrMD.id_class(linkedHashMap, new rrhw_3());
        rrMD.id_class(linkedHashMap, new rrhI_2());
        rrMD.id_class(linkedHashMap, new rrhf_3());
        rrMD.id_class(linkedHashMap, new rrhj_3());
        rrMD.id_class(linkedHashMap, new rrhR_2());
        rrMD.id_class(linkedHashMap, new rrhY_2());
        rrMD.id_class(linkedHashMap, new rrho_3());
        rrMD.id_class(linkedHashMap, new rrhK_2());
        rrMD.id_class(linkedHashMap, new rrhD_2());
        rrMD.id_class(linkedHashMap, new rrhU_2());
        rrMD.id_class(linkedHashMap, new rrhe_3());
        rrMD.id_class(linkedHashMap, new rrha_3());
        rrMD.id_class(linkedHashMap, new rrhi_3());
        rrMD.id_class(linkedHashMap, new rrXr_1());
        rrMD.id_class(linkedHashMap, new rrXP());
        rrMD.id_class(linkedHashMap, new rrXB());
        rrMD.id_class(linkedHashMap, new rrXS());
        rrMD.id_class(linkedHashMap, new rrXs_1());
        rrMD.id_class(linkedHashMap, new rrXE());
        rrMD.id_class(linkedHashMap, new rrXG());
        rrMD.id_class(linkedHashMap, new rrXb_1());
        rrMD.id_class(linkedHashMap, new rrXM());
        rrMD.id_class(linkedHashMap, new rrhL_2());
        rrMD.id_class(linkedHashMap, new rrOe_1());
        rrMD.id_class(linkedHashMap, new rrOP());
        rrMD.id_class(linkedHashMap, new rrOS());
        rrMD.id_class(linkedHashMap, new rrOE());
        rrMD.id_class(linkedHashMap, new rrOO());
        rrMD.id_class(linkedHashMap, new rrOh_1());
        rrMD.id_class(linkedHashMap, new rrOx_1());
        rrMD.id_class(linkedHashMap, new rrOd_1());
        rrMD.id_class(linkedHashMap, new rrOz_1());
        rrMD.id_class(linkedHashMap, new rrOF());
        rrMD.id_class(linkedHashMap, new rrOT());
        rrMD.id_class(linkedHashMap, new rrOt_1());
        rrMD.id_class(linkedHashMap, new rrOw_1());
        rrMD.id_class(linkedHashMap, new rrOI());
        rrMD.id_class(linkedHashMap, new rrOf_1());
        rrMD.id_class(linkedHashMap, new rrOj_1());
        rrMD.id_class(linkedHashMap, new rrhn_3());
        rrMD.id_class(linkedHashMap, new rrhl_3());
        rrMD.id_class(linkedHashMap, new rrhV_2());
        rrMD.id_class(linkedHashMap, new rrhg_3());
        return linkedHashMap;
    }
}

