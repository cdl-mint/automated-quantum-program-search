/*
 * generated by Xtext 2.31.0
 */
package qubo.lang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import qubo.lang.ide.contentassist.antlr.internal.InternalQUBOParser;
import qubo.lang.services.QUBOGrammarAccess;

public class QUBOParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(QUBOGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, QUBOGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives(), "rule__EDouble__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getQuboAccess().getGroup(), "rule__Qubo__Group__0");
			builder.put(grammarAccess.getQuboAccess().getGroup_4(), "rule__Qubo__Group_4__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup(), "rule__Matrix__Group__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_2(), "rule__Matrix__Group_2__0");
			builder.put(grammarAccess.getMatrixAccess().getGroup_2_1(), "rule__Matrix__Group_2_1__0");
			builder.put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
			builder.put(grammarAccess.getRowAccess().getGroup_2(), "rule__Row__Group_2__0");
			builder.put(grammarAccess.getRowAccess().getGroup_2_1(), "rule__Row__Group_2_1__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getQuboAccess().getNameAssignment_2(), "rule__Qubo__NameAssignment_2");
			builder.put(grammarAccess.getQuboAccess().getMatrixAssignment_4_1(), "rule__Qubo__MatrixAssignment_4_1");
			builder.put(grammarAccess.getMatrixAccess().getRowsAssignment_2_0(), "rule__Matrix__RowsAssignment_2_0");
			builder.put(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1(), "rule__Matrix__RowsAssignment_2_1_1");
			builder.put(grammarAccess.getRowAccess().getColumnsAssignment_2_0(), "rule__Row__ColumnsAssignment_2_0");
			builder.put(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1(), "rule__Row__ColumnsAssignment_2_1_1");
			builder.put(grammarAccess.getColumnAccess().getValueAssignment_1(), "rule__Column__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private QUBOGrammarAccess grammarAccess;

	@Override
	protected InternalQUBOParser createParser() {
		InternalQUBOParser result = new InternalQUBOParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public QUBOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QUBOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}