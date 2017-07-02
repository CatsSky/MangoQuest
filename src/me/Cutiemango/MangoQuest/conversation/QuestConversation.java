package me.Cutiemango.MangoQuest.conversation;

import java.util.List;
import net.citizensnpcs.api.npc.NPC;

public class QuestConversation
{
	public QuestConversation(String s, String internal, NPC n, List<QuestBaseAction> list)
	{
		name = s;
		action = list;
		id = internal;
		npc = n;
	}

	protected List<QuestBaseAction> action;
	protected String name;
	protected String id;
	protected NPC npc;

	public List<QuestBaseAction> getActions()
	{
		return action;
	}

	public String getName()
	{
		return name;
	}

	public String getInternalID()
	{
		return id;
	}

	public NPC getNPC()
	{
		return npc;
	}

	public boolean hasNPC()
	{
		return npc != null;
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setNPC(NPC n)
	{
		npc = n;
	}
	
	public void setActions(List<QuestBaseAction> l)
	{
		action = l;
	}
	
	@Override
	public QuestConversation clone()
	{
		return new QuestConversation(name, id, npc, action);
	}

}
